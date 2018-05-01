import AST.*;
import Symbols.*;

public class DefPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;

    public DefPhase(Scope currentScope) {
        this.currentScope = currentScope;
    }

    @Override
    public T visit(AST node) {
        for (int i = 0; i < node.classes.size(); i++) {
            visit(node.classes.get(i));
        }
        for (int i = 0; i < node.vars.size(); i++) {
            visit(node.vars.get(i));
        }
        for (int i = 0; i < node.funcs.size(); i++) {
            visit(node.funcs.get(i));
        }
        return null;
    }

    @Override
    public T visit(ArefNode arefNode) {
        return null;
    }

    @Override
    public T visit(ArrayType arrayType) {
        return null;
    }

    @Override
    public T visit(BinaryOpNode binaryOpNode) {
        return null;
    }

    @Override
    public T visit(BlockNode blockNode) {
        if (blockNode.stmts == null) return null;
        for (int i = 0; i < blockNode.stmts.size(); i++) {
            blockNode.stmts.get(i).accept(this);
        }
        return null;
    }

    @Override
    public T visit(BreakNode breakNode) {
        return null;
    }

    @Override
    public T visit(BuiltInType builtInType) {
        return null;
    }

    @Override
    public T visit(ClassNode classNode) {
        currentScope.define(classNode.name, new ClassTypeSymbol(classNode.name));
        classNode.scope = new LocalScope(classNode.name, currentScope);
        currentScope = classNode.scope;
        if (classNode.memberv != null) {
            for (int i = 0; i < classNode.memberv.size(); i++) {
                classNode.memberv.get(i).accept(this);
            }
        }
        if (classNode.memberf != null) {
            for (int i = 0; i < classNode.memberf.size(); i++) {
                classNode.memberf.get(i).accept(this);
            }
        }
        return null;
    }

    @Override
    public T visit(ClassType classType) {
        return null;
    }

    @Override
    public T visit(ContinueNode continueNode) {
        return null;
    }

    @Override
    public T visit(ExprNode exprNode) {
        return null;
    }

    @Override
    public T visit(ExprStmtNode exprStmtNode) {
        return null;
    }

    @Override
    public T visit(ForNode forNode) {
        return null;
    }

    @Override
    public T visit(FuncDeclNode funcDeclNode) {
        TypeSymbol returnTypeSymbol = (TypeSymbol) currentScope.resolve(funcDeclNode.type);
//        TypeSymbol returnTypeSymbol = (TypeSymbol) funcDeclNode.type.accept(this);
        FunctionTypeSymbol funcSymbol = new FunctionTypeSymbol(returnTypeSymbol, funcDeclNode.name);
        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                VariableDecl vard = funcDeclNode.parameters.get(i);
                TypeSymbol typeSymbol = (TypeSymbol) vard.type.accept(this);
                funcSymbol.addArg(typeSymbol, vard.name);
            }
        }
        currentScope.define(funcDeclNode.name, funcSymbol);

        funcDeclNode.scope = new LocalScope(funcDeclNode.name, currentScope);
        currentScope = funcDeclNode.scope;
        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                funcDeclNode.parameters.get(i).accept(this);
            }
        }
        funcDeclNode.body.accept(this);
        currentScope = currentScope.getEnclosingScope();
        return null;
    }

    @Override
    public T visit(FunctionCallNode functionCallNode) {
        return null;
    }

    @Override
    public T visit(FunctionType functionType) {
        return null;
    }

    @Override
    public T visit(IfNode ifNode) {
        return null;
    }

    @Override
    public T visit(IntegerLiteralNode integerLiteralNode) {
        return null;
    }

    @Override
    public T visit(LiteralNode literalNode) {
        return null;
    }

    @Override
    public T visit(MemberNode memberNode) {
        return null;
    }

    @Override
    public T visit(MemberFuncNode memberFuncNode) {
        return null;
    }

    @Override
    public T visit(NewExpr newExpr) {
        return null;
    }

    @Override
    public T visit(PostOpNode postOpNode) {
        return null;
    }

    @Override
    public T visit(ReturnNode returnNode) {
        return null;
    }

    @Override
    public T visit(StmtNode stmtNode) {
        return null;
    }

    @Override
    public T visit(StringLiteralNode stringLiteralNode) {
        return null;
    }

    @Override
    public T visit(ThisNode thisNode) {
        return null;
    }

    @Override
    public T visit(TypeDefinition typeDefinition) {
        return null;
    }

    @Override
    public T visit(UnaryExprNode unaryExprNode) {
        return null;
    }

    @Override
    public T visit(VariableDecl variableDecl) {
        TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(variableDecl.type);
        currentScope.define(variableDecl.name, typeSymbol);
        return null;
    }

    @Override
    public T visit(VariableNode variableNode) {
        return null;
    }

    @Override
    public T visit(WhileNode whileNode) {
        return null;
    }
}
