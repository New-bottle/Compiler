import AST.*;

import java.io.PrintStream;

public class PrintASTVisitor<T> implements ASTVisitor<T> {
    private PrintStream out;
    private StringBuilder bd = new StringBuilder();
    public PrintASTVisitor(PrintStream out) {
        this.out = out;
    }

    private String indent() {
        return bd.toString();
    }
    private void left() {
        bd.delete(bd.length()-2, bd.length());
    }
    private void right() {
        bd.append("  ");
    }
    public T visit(AST node) {
        out.println("<root> :");
        right();
        for (int i = 0; i < node.vars.size(); i++) {
            visit(node.vars.get(i));
        }
        for (int i = 0; i < node.classes.size(); i++){
            visit(node.classes.get(i));
        }
        for (int i = 0; i < node.funcs.size(); ++i) {
            visit(node.funcs.get(i));
        }
        left();
        return null;
    }

    public T visit(ArefNode arefNode) {
        out.print("<Aref :");
        arefNode.name.accept(this);
        out.print("[");
        arefNode.iter.accept(this);
        out.print("]>");
        return null;
    }

    public T visit(ArrayType arrayType) {
        out.print("<ArrayType :");
        arrayType.baseType.accept(this);
        out.print(">");
        return null;
    }

    public T visit(BinaryOpNode binaryOpNode) {
        out.print("(");
        binaryOpNode.left.accept(this);
        out.print(" ");
        out.print(binaryOpNode.op.toString());
        out.print(" ");
        binaryOpNode.right.accept(this);
        out.print(")");
        return null;
    }

    public T visit(BlockNode blockNode) {
        out.println(indent()+"BlockNode:");
        if (blockNode.stmts != null) {
            for (int i = 0; i < blockNode.stmts.size(); i++) {
                blockNode.stmts.get(i).accept(this);
            }
        }
        return null;
    }

    @Override
    public T visit(BoolLiteralNode boolLiteralNode) {
        out.print("<BoolLiteral: "+boolLiteralNode.name+">");
        return null;
    }

    public T visit(BreakNode breakNode) {
        out.println(indent()+"Break");
        return null;
    }

    public T visit(BuiltInType builtInType) {
        out.print(builtInType.getType().toString());
        return null;
    }

    public T visit(ClassNode classNode) {
        out.println(indent()+"ClassDecl: "+classNode.name);
        right();
        out.println(indent()+"memberv:");
        if (classNode.memberv != null) {
            for (int i = 0; i < classNode.memberv.size(); i++) {
                classNode.memberv.get(i).accept(this);
            }
        }
        out.println(indent()+"memberf:");
        if (classNode.memberf != null) {
            for (int i = 0; i < classNode.memberf.size(); i++) {
                classNode.memberf.get(i).accept(this);
            }
        }
        return null;
    }

    public T visit(ClassType classType) {
        out.print("<ClassTypeSymbol "+classType.name+"> ");
        return null;
    }

    public T visit(ContinueNode continueNode) {
        out.println(indent()+"Continue");
        return null;
    }

    public T visit(ExprNode exprNode) {

        return null;
    }

    public T visit(ExprStmtNode exprStmtNode) {
        out.print(indent()+"ExprStmt:");
        exprStmtNode.expr.accept(this);
        out.println("");
        return null;
    }

    public T visit(ForNode forNode) {
        out.println(indent()+"ForNode: ");
        right();
        if (forNode.initWithDecl!=null) {
            out.print(indent()+"initWithDecl:");
            forNode.initWithDecl.accept(this);
        } else {
            out.print(indent()+"init:");
            forNode.init.accept(this);
        }
        out.println("");
        out.print(indent()+"cond:");
        forNode.cond.accept(this);
        out.println("");
        out.print(indent()+"iter:");
        forNode.iter.accept(this);
        out.println("");
        forNode.body.accept(this);
        left();
        return null;
    }

    public T visit(FuncDeclNode funcDeclNode) {
        out.print(indent()+"funcDecl: <");
        funcDeclNode.type.accept(this);
        out.print(">");
        out.print(funcDeclNode.name);
        out.print("(");
        if (funcDeclNode.parameters != null) {
            right();
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                funcDeclNode.parameters.get(i).accept(this);
            }
            left();
        }
        out.println(")");
        right();
        funcDeclNode.body.accept(this);
        left();
        return null;
    }

    public T visit(FunctionCallNode functionCallNode) {
        out.print("{FuncCall:");
        out.print(functionCallNode.name);
        if (functionCallNode.parameters!=null) {
            out.print(" parameters:");
            for (int i = 0; i < functionCallNode.parameters.size(); i++) {
                functionCallNode.parameters.get(i).accept(this);
                out.print(", ");
            }
        }
        out.println("}");
        return null;
    }

    public T visit(FunctionType functionType) {
        //TODO
        return null;
    }

    public T visit(IfNode ifNode) {
        //TODO
        return null;
    }

    public T visit(IntegerLiteralNode integerLiteralNode) {
        out.print("IntegerLiteral:");
        out.print(integerLiteralNode.name);
        return null;
    }

    public T visit(LiteralNode literalNode) {

        return null;
    }

    public T visit(MemberNode memberNode) {
        out.print("MemberAccess:");
        memberNode.expr.accept(this);
        out.print(".");
        out.print(memberNode.name);
        return null;
    }

    public T visit(MemberFuncNode memberFuncNode) {
        out.print("MemberFuncAcess:");
        memberFuncNode.expr.accept(this);
        out.print(".");
        out.print(memberFuncNode.name);
        if (memberFuncNode.parameters != null) {
            right();
            for (int i = 0; i < memberFuncNode.parameters.size(); i++) {
                memberFuncNode.parameters.get(i).accept(this);
            }
            left();
        }
        return null;
    }

    public T visit(NewExpr newExpr) {
        out.print("NewExpr:");
        newExpr.type.accept(this);
        if (newExpr.dim != null) {
            out.print("dims:");
            for (int i = 0; i < newExpr.dim.size()-newExpr.posDim.size(); i++) {
                newExpr.dim.get(i).accept(this);
                out.print(" ");
            }
        }
        out.println("");
        return null;
    }

    @Override
    public T visit(NullNode nullNode) {
        out.print("null");
        return null;
    }

    public T visit(PostOpNode postOpNode) {
        out.print("(PostOp:");
        postOpNode.expr.accept(this);
        out.print(" "+postOpNode.op.toString()+")");
        return null;
    }

    public T visit(ReturnNode returnNode) {
        out.print(indent()+"Return ");
        if (returnNode.expr != null) {
            returnNode.expr.accept(this);
        }
        out.println("");
        return null;
    }

    public T visit(StmtNode stmtNode) {

        return null;
    }

    public T visit(StringLiteralNode stringLiteralNode) {
        out.print("<"+stringLiteralNode.name+">");
        return null;
    }

    public T visit(ThisNode thisNode) {
        out.print("<THIS>");
        return null;
    }

    public T visit(VariableDecl variableDecl) {
        out.print(indent()+"VariableDecl:");
        variableDecl.type.accept(this);
        out.print(" " + variableDecl.name);
        if (variableDecl.init != null) {
            out.print(" Init=");
            variableDecl.init.accept(this);
        }
        out.println("");
        return null;
    }

    public T visit(VariableNode variableNode) {
        out.print("VariableNode:");
        out.print(variableNode.name);
        return null;
    }

    public T visit(UnaryExprNode unaryExprNode) {
        out.print("(");
        out.print(unaryExprNode.op.toString());
        out.print(" ");
        unaryExprNode.expr.accept(this);
        out.print(")");
        return null;
    }

    public T visit(WhileNode whileNode) {
        out.print(indent()+"While:");
        whileNode.cond.accept(this);
        out.println();
        right();
        whileNode.body.accept(this);
        left();
        return null;
    }
}
