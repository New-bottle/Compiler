import AST.*;
import Symbols.Symbol;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;
import Exception.*;

public class BuildASTVisitor extends grammarsBaseVisitor<Node> {

    @Override
    public Node visitProg(grammarsParser.ProgContext ctx) {
        List<Node> comps = new ArrayList<Node>();
        List<FuncDeclNode> funcs = new ArrayList<FuncDeclNode>();
        List<VariableDecl> vars = new ArrayList<VariableDecl>();
        List<ClassNode>    classes = new ArrayList<ClassNode>();

        List<Node> children = new ArrayList<Node>();
        List<grammarsParser.CompContext> tmp = ctx.comp();
        for (int i = 0; i < tmp.size(); i++) {
            Node t = visit(tmp.get(i));
            comps.add(t);
            if (t instanceof FuncDeclNode) {
                funcs.add((FuncDeclNode)t);
            } else if (t instanceof VariableDecl) {
                vars.add((VariableDecl)t);
            } else {
                classes.add((ClassNode)t);
            }
        }
        return new AST(comps, funcs, vars, classes);
    }

    @Override
    public Node visitGlobalFuncDecl(grammarsParser.GlobalFuncDeclContext ctx) {
        return visit(ctx.funcDecl());
    }

    @Override
    public Node visitGlobalClassDecl(grammarsParser.GlobalClassDeclContext ctx) {
        return visit(ctx.classDecl());
    }

    @Override
    public Node visitGlobalVarDecl(grammarsParser.GlobalVarDeclContext ctx) {
        return visit(ctx.varDecl());
    }

    @Override
    public Node visitFuncDecl(grammarsParser.FuncDeclContext ctx) {
        Type type = (Type)(ctx.typeSpecifier()).accept(this);
        String name = ctx.ID().getText();
        List<VariableDecl> parameters = new ArrayList<VariableDecl>();
        StmtNode body = (StmtNode)visit(ctx.blockStatement());
        if (ctx.parameterList() != null) {
            List<grammarsParser.ParameterContext> tmp = ctx.parameterList().parameter();
            for (int i = 0; i < tmp.size(); i++) {
                parameters.add((VariableDecl) visit(tmp.get(i)));
            }
        } else {
            parameters = null;
        }
        return new FuncDeclNode(type, name, parameters, body);
    }

    @Override
    public Node visitParameter(grammarsParser.ParameterContext ctx) {
        Type type = (Type) visit(ctx.typeSpecifier());
        String name = ctx.ID().getText();
        return new VariableDecl(type, name);
    }

    @Override
    public Node visitVarDecl(grammarsParser.VarDeclContext ctx) {
        Type type = (Type) visit(ctx.typeSpecifier());
        String name = ctx.ID().getText();
        ExprNode init = null;
        if (ctx.expr() != null) {
            init = (ExprNode) visit(ctx.expr());
        }
        return new VariableDecl(type, name, init);

    }

    @Override
    public Node visitClassDecl(grammarsParser.ClassDeclContext ctx) {
        String name = ctx.ID().getText();
        List<VariableDecl> memberv = new ArrayList<VariableDecl>();
        List<FuncDeclNode> memberf = new ArrayList<FuncDeclNode>();
        List<grammarsParser.ClassStatContext> tmp = ctx.classStat();
        for (int i = 0; i < tmp.size(); ++i) {
            Node t = visit(tmp.get(i));
            if (t instanceof VariableDecl) {
                memberv.add((VariableDecl)t);
            } else {
                memberf.add((FuncDeclNode)t);
            }
        }
        return new ClassNode(name, memberv, memberf);
    }

    @Override
    public Node visitMembervar(grammarsParser.MembervarContext ctx) {
        return visit(ctx.varDecl());
    }

    @Override
    public Node visitMemberfunc(grammarsParser.MemberfuncContext ctx) {
        return visit(ctx.funcDecl());
    }

    @Override
    public Node visitConstructor(grammarsParser.ConstructorContext ctx) {
//        ClassType type = new ClassType(ctx.parent.getText());
        BuiltInType type = new BuiltInType(Symbol.Types.VOID);
        String father = ((grammarsParser.ClassDeclContext)ctx.parent).ID().getText();
        if (!ctx.ID().getText().equals(father)) {
            throw new MemberError("Constructor's name <" + ctx.ID().getText()+"> should match class name <" + father + ">.");
        }
        List<VariableDecl> parameters = new ArrayList<VariableDecl>();
        StmtNode body = (StmtNode) ctx.blockStatement().accept(this);
        if (ctx.parameterList() != null) {
            List<grammarsParser.ParameterContext> tmp = ctx.parameterList().parameter();
            for (int i = 0; i < tmp.size(); i++) {
                parameters.add((VariableDecl)visit(tmp.get(i)));
            }
        }
        return new FuncDeclNode(type, "__constructor__"+ctx.ID().getText(), parameters, body);
    }

    @Override
    public Node visitBlockStatement(grammarsParser.BlockStatementContext ctx) {
        List<StmtNode> stmts = new ArrayList<StmtNode>();
        List<grammarsParser.StatContext> tmp = ctx.stat();
        for (int i = 0; i < tmp.size(); i++) {
            stmts.add((StmtNode) visit(tmp.get(i)));
        }
        return new BlockNode(stmts);
    }

    @Override
    public Node visitBlock(grammarsParser.BlockContext ctx) {
        if (ctx.blockStatement() != null) {
            List<StmtNode> stmts = new ArrayList<StmtNode>();
            List<grammarsParser.StatContext> tmp = ctx.blockStatement().stat();
            for (int i = 0; i < tmp.size(); i++) {
                stmts.add((StmtNode) visit(tmp.get(i)));
            }
            return new BlockNode(stmts);
        } else {
            return new BlockNode(null);
        }
    }

    @Override
    public Node visitNonArrayTypeSpecifier(grammarsParser.NonArrayTypeSpecifierContext ctx) {
        switch (ctx.type.getType()) {
            case grammarsParser.INT_ID : return new BuiltInType(Symbol.Types.INT);
            case grammarsParser.BOOL_ID: return new BuiltInType(Symbol.Types.BOOL);
            case grammarsParser.STR_ID : return new ClassType("string");
            case grammarsParser.VOID_ID: return new BuiltInType(Symbol.Types.VOID);
            case grammarsParser.ID     : return new ClassType(ctx.ID().getText());
            default: throw new RuntimeException("not matched in 'nonArrayTypeSpecifier'");
        }
    }

    @Override
    public Node visitArrayType(grammarsParser.ArrayTypeContext ctx) {
        return new ArrayType( (Type)ctx.typeSpecifier().accept(this) );
    }

    @Override
    public Node visitNonArrayType(grammarsParser.NonArrayTypeContext ctx) {
        return visit(ctx.nonArrayTypeSpecifier());
    }

    /*
    @Override
    public Node visitArrayType(grammarsParser.ArrayTypeContext ctx) {
        return new ArrayType((Symbol))
    }
    */

    @Override
    public Node visitIf(grammarsParser.IfContext ctx) {
        ExprNode cond = (ExprNode) visit(ctx.ifStat().expr());
        StmtNode then = (StmtNode) visit(ctx.ifStat().stat(0));
        StmtNode otherwise = null;
        if (ctx.ifStat().stat(1) != null)
            otherwise = (StmtNode) visit(ctx.ifStat().stat(1));
        return new IfNode(cond, then, otherwise);
    }

    @Override
    public Node visitJump(grammarsParser.JumpContext ctx) {
        return visit(ctx.jumpStatement());
    }

    @Override
    public Node visitFor(grammarsParser.ForContext ctx) {
        return visit(ctx.forStat());
    }

    @Override
    public Node visitForStat(grammarsParser.ForStatContext ctx) {
        ExprNode cond = null;
        if (ctx.cond != null) cond = (ExprNode) visit(ctx.cond);
        ExprNode iter = null;
        if (ctx.iter != null) iter = (ExprNode) ctx.iter.accept(this);
        StmtNode stmt = (StmtNode) visit(ctx.stat());
        if (ctx.declinit != null) {
            VariableDecl initWithDecl = (VariableDecl) visit(ctx.declinit);
            return new ForNode(null, initWithDecl, cond, iter, stmt);
        } else if (ctx.init != null) {
            ExprNode init = (ExprNode) visit(ctx.init);
            return new ForNode(init, null, cond, iter, stmt);
        } else {
            return new ForNode(null, null, cond, iter, stmt);
        }
    }

    @Override
    public Node visitWhile(grammarsParser.WhileContext ctx) {
        return visit(ctx.whileStat());
    }

    @Override
    public Node visitWhileStat(grammarsParser.WhileStatContext ctx) {
        ExprNode expr = (ExprNode) visit(ctx.expr());
        StmtNode stmt = (StmtNode) visit(ctx.stat());
        return new WhileNode(expr, stmt);
    }

    @Override
    public Node visitSingleexpr(grammarsParser.SingleexprContext ctx) {
        if (ctx.expr() != null)
            return new ExprStmtNode((ExprNode)visit(ctx.expr()));
        else
            return new ExprStmtNode(null);
    }

    @Override
    public Node visitContinue(grammarsParser.ContinueContext ctx) {
        return new ContinueNode();
    }

    @Override
    public Node visitBreak(grammarsParser.BreakContext ctx) {
        return new BreakNode();
    }

    @Override
    public Node visitReturn(grammarsParser.ReturnContext ctx) {
        if (ctx.expr() != null)
            return new ReturnNode((ExprNode)ctx.expr().accept(this));
        else
            return new ReturnNode(null);
    }

    /*
    @Override
    public Node visitIfStat(grammarsParser.IfStatContext ctx) {
        ExprNode cond = (ExprNode) visit(ctx.expr());
        StmtNode then = (StmtNode) visit(ctx.stat(0));
        StmtNode otherwise = (StmtNode) visit(ctx.stat(1));
        return new IfNode(cond, then, otherwise);
    }

    @Override
    public Node visitReturnStat(grammarsParser.ReturnStatContext ctx) {
        ExprNode expr = (ExprNode) visit(ctx.expr());
        return new ReturnNode(expr);
    }

    */

    @Override
    public Node visitPostfixIncDec(grammarsParser.PostfixIncDecContext ctx) {
        UnaryOpNode.UnaryOp op = null;
        switch (ctx.op.getType()) {
            case grammarsParser.DADD : op = UnaryOpNode.UnaryOp.ADD; break;
            case grammarsParser.DSUB : op = UnaryOpNode.UnaryOp.SUB; break;
        }
        ExprNode expr = (ExprNode) visit(ctx.expr());
        return new PostOpNode(expr, op);
    }

    @Override
    public Node visitCall(grammarsParser.CallContext ctx) {
        if (ctx.exprList() != null) {
            List<ExprNode> parameters = new ArrayList<ExprNode>();
            List<grammarsParser.ExprContext> tmp = ctx.exprList().expr();
            for (int i = 0; i < tmp.size(); i++) {
                parameters.add((ExprNode) visit(tmp.get(i)));
            }
            return new FunctionCallNode(ctx.ID().getText(), parameters);
        } else {
            return new FunctionCallNode(ctx.ID().getText(), null);
        }
    }

    @Override
    public Node visitIndex(grammarsParser.IndexContext ctx) {
        ExprNode name = (ExprNode)ctx.expr(0).accept(this);
        ExprNode iter = (ExprNode)ctx.expr(1).accept(this);
        return new ArefNode(name, iter);
    }

    @Override
    public Node visitMemberAccess(grammarsParser.MemberAccessContext ctx) {
        ExprNode expr = (ExprNode)visit(ctx.expr());
        String name = ctx.ID().getText();
        return new MemberNode(expr, name);
    }

    @Override
    public Node visitMemberFuncAccess(grammarsParser.MemberFuncAccessContext ctx) {
        ExprNode expr = (ExprNode)visit(ctx.expr());
        String name = ctx.ID().getText();
        if (ctx.exprList() != null) {
            List<ExprNode> parameters = new ArrayList<ExprNode>();
            List<grammarsParser.ExprContext> tmp = ctx.exprList().expr();
            for (int i = 0; i < tmp.size(); i++) {
                parameters.add((ExprNode) visit(tmp.get(i)));
            }
            return new MemberFuncNode(expr, name, parameters);
        } else {
            return new MemberFuncNode(expr, name, null);
        }
    }

    @Override
    public Node visitUnaryExpr(grammarsParser.UnaryExprContext ctx) {
        UnaryOpNode.UnaryOp op = null;
        switch (ctx.op.getType()) {
            case grammarsParser.DADD : op = UnaryOpNode.UnaryOp.ADD; break;
            case grammarsParser.DSUB : op = UnaryOpNode.UnaryOp.SUB; break;
            case grammarsParser.ADD  : op = UnaryOpNode.UnaryOp.POS; break;
            case grammarsParser.SUB  : op = UnaryOpNode.UnaryOp.NEG; break;
            case grammarsParser.NOT  : op = UnaryOpNode.UnaryOp.LNOT; break;
            case grammarsParser.BNOT : op = UnaryOpNode.UnaryOp.BNOT; break;
        }
        ExprNode expr = (ExprNode) visit(ctx.expr());
        return new UnaryExprNode(op, expr);
    }

    @Override
    public Node visitNew(grammarsParser.NewContext ctx) {
        return visit(ctx.creator());
    }

    @Override
    public Node visitBinaryExpr(grammarsParser.BinaryExprContext ctx) {
        BinaryOpNode.BinaryOp op = null;
        switch (ctx.op.getType()) {
            case grammarsParser.ASSIGN : op = BinaryOpNode.BinaryOp.ASSIGN; break;
            case grammarsParser.ADD : op = BinaryOpNode.BinaryOp.ADD; break;
            case grammarsParser.SUB : op = BinaryOpNode.BinaryOp.SUB; break;
            case grammarsParser.DIV : op = BinaryOpNode.BinaryOp.DIV; break;
            case grammarsParser.MUL : op = BinaryOpNode.BinaryOp.MUL; break;
            case grammarsParser.MOD : op = BinaryOpNode.BinaryOp.MOD; break;
            case grammarsParser.XOR : op = BinaryOpNode.BinaryOp.XOR; break;
            case grammarsParser.AND : op = BinaryOpNode.BinaryOp.AND; break;
            case grammarsParser.OR  : op = BinaryOpNode.BinaryOp.OR; break;
            case grammarsParser.LAND: op = BinaryOpNode.BinaryOp.LAND; break;
            case grammarsParser.LOR : op = BinaryOpNode.BinaryOp.LOR; break;
            case grammarsParser.EQ  : op = BinaryOpNode.BinaryOp.EQ; break;
            case grammarsParser.NE  : op = BinaryOpNode.BinaryOp.NE; break;
            case grammarsParser.SHL : op = BinaryOpNode.BinaryOp.SHL; break;
            case grammarsParser.SHR : op = BinaryOpNode.BinaryOp.SHR; break;
            case grammarsParser.LT  : op = BinaryOpNode.BinaryOp.LT; break;
            case grammarsParser.GT  : op = BinaryOpNode.BinaryOp.GT; break;
            case grammarsParser.LE  : op = BinaryOpNode.BinaryOp.LE; break;
            case grammarsParser.GE  : op = BinaryOpNode.BinaryOp.GE; break;
        }
        Node left = visit(ctx.expr(0));
        Node right = visit(ctx.expr(1));
        return new BinaryOpNode(op, (ExprNode)left, (ExprNode)right);
    }

    @Override
    public Node visitVar(grammarsParser.VarContext ctx) {
        return new VariableNode(ctx.ID().getText());
    }

    @Override
    public Node visitThis(grammarsParser.ThisContext ctx) {
        return new ThisNode();
    }

    @Override
    public Node visitLiteral(grammarsParser.LiteralContext ctx) {
        return visit(ctx.constant());
    }

    @Override
    public Node visitConstant(grammarsParser.ConstantContext ctx) {
        switch (ctx.type.getType()) {
            case grammarsParser.IntLiteral : return new IntegerLiteralNode(ctx.type.getText());
            case grammarsParser.STRING : return new StringLiteralNode(ctx.type.getText());
            case grammarsParser.NULL_ID: return new NullNode();
            case grammarsParser.BoolLiteral: return new BoolLiteralNode(ctx.type.getText());
            default: throw new RuntimeException("Wrong literal symbol.");
        }
    }

    @Override
    public Node visitParens(grammarsParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Node visitCreatorError(grammarsParser.CreatorErrorContext ctx) {
        throw new ParseCancellationException("Array dimension specification in new expression should be left aligned.");
    }

    @Override
    public Node visitCreatorArray(grammarsParser.CreatorArrayContext ctx) {
        Type type = (Type)visit(ctx.nonArrayTypeSpecifier());
        List<ExprNode> dim = null;
        if (ctx.expr() != null) {
            dim = new ArrayList<ExprNode>();
            List<grammarsParser.ExprContext> tmp = ctx.expr();
            for (int i = 0; i < tmp.size(); i++) {
                dim.add((ExprNode)(tmp.get(i)).accept(this));
            }
        }
        List<SourcePosition> posDim = new ArrayList<SourcePosition>();
        int unspecified = ctx.getTokens(grammarsParser.LBracket).size() - ctx.expr().size();
        for (int i = 0; i < unspecified; i++) {
            dim.add(null);
            posDim.add(null);
        }
        return new NewExpr(type, dim, posDim);
    }

    @Override
    public Node visitCreatorFunction(grammarsParser.CreatorFunctionContext ctx) {
        if (ctx.nonArrayTypeSpecifier().ID().getSymbol().getType() != grammarsParser.ID)
            throw new TypeError("Can't call constructor function");
        Type type = (Type)visit(ctx.nonArrayTypeSpecifier());
        return new NewExpr(type, null, null);
    }

    @Override
    public Node visitCreatorNonArray(grammarsParser.CreatorNonArrayContext ctx) {
        Type type = (Type)visit(ctx.nonArrayTypeSpecifier());
        return new NewExpr(type, null, null);
    }
}
