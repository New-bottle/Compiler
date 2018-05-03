package SemanticCheck;

import AST.*;
import Symbols.*;
import Exception.*;

import java.util.ArrayList;
import java.util.List;

public class SecondPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;
    private List<Type> BuiltInTypeTable;

    public SecondPhase(Scope currentScope) {
        this.currentScope = currentScope;
        BuiltInTypeTable = new ArrayList<Type>();
        BuiltInTypeTable.add(new BuiltInType(Symbol.Types.INT));
        BuiltInTypeTable.add(new BuiltInType(Symbol.Types.BOOL));
        BuiltInTypeTable.add(new ClassType("string"));
    }

    @Override
    public T visit(AST node) {
        for (int i = 0; i < node.classes.size(); i++) {
            node.classes.get(i).accept(this);
        }
        return null;
    }

    @Override
    public T visit(WhileNode whileNode) {
        return null;
    }

    @Override
    public T visit(VariableNode variableNode) {
        return null;
    }

    @Override
    public T visit(VariableDecl variableDecl) {
        variableDecl.type.accept(this);
        TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(variableDecl.type);
        if (typeSymbol.type == Symbol.Types.VOID) {
            throw new TypeError("Can't make a variable of void.");
        }
        if (variableDecl.init != null) {
            variableDecl.init.accept(this);
            if (!variableDecl.init.exprType.equals(variableDecl.type)) {
                if (BuiltInTypeTable.contains(variableDecl.type) || variableDecl.init.exprType.getType() != Symbol.Types.NULL)
                    throw new TypeError("Initial expr's type doesn't match.");
            }
        }
        currentScope.define(variableDecl.name, new VariableSymbol(typeSymbol, variableDecl.name));
        return null;    }

    @Override
    public T visit(UnaryExprNode unaryExprNode) {
        return null;
    }

    @Override
    public T visit(ThisNode thisNode) {
        return null;
    }

    @Override
    public T visit(StringLiteralNode stringLiteralNode) {
        return null;
    }

    @Override
    public T visit(StmtNode stmtNode) {
        return null;
    }

    @Override
    public T visit(ReturnNode returnNode) {
        return null;
    }

    @Override
    public T visit(PostOpNode postOpNode) {
        return null;
    }

    @Override
    public T visit(NullNode nullNode) {
        return null;
    }

    @Override
    public T visit(NewExpr newExpr) {
        return null;
    }

    @Override
    public T visit(MemberFuncNode memberFuncNode) {
        return null;
    }

    @Override
    public T visit(MemberNode memberNode) {
        return null;
    }

    @Override
    public T visit(LiteralNode literalNode) {
        return null;
    }

    @Override
    public T visit(IntegerLiteralNode integerLiteralNode) {
        return null;
    }

    @Override
    public T visit(IfNode ifNode) {
        return null;
    }

    @Override
    public T visit(FunctionType functionType) {
        return null;
    }

    @Override
    public T visit(FunctionCallNode functionCallNode) {
        return null;
    }

    @Override
    public T visit(FuncDeclNode funcDeclNode) {
        TypeSymbol returnTypeSymbol = (TypeSymbol) currentScope.resolve(funcDeclNode.type);
        FunctionTypeSymbol funcSymbol = new FunctionTypeSymbol(returnTypeSymbol, funcDeclNode.name);

        funcDeclNode.scope = new LocalScope(funcDeclNode.name, currentScope);
        currentScope = funcDeclNode.scope;
        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                VariableDecl vard = funcDeclNode.parameters.get(i);
                TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(vard.type);
                funcSymbol.addArg(typeSymbol, vard.name);
                currentScope.define(vard.name, new VariableSymbol(typeSymbol, vard.name));
            }
        }
        currentScope = currentScope.getEnclosingScope();

        currentScope.define(funcDeclNode.name, funcSymbol);
        return null;
    }

    @Override
    public T visit(ForNode forNode) {
        return null;
    }

    @Override
    public T visit(ExprStmtNode exprStmtNode) {
        return null;
    }

    @Override
    public T visit(ExprNode exprNode) {
        return null;
    }

    @Override
    public T visit(ContinueNode continueNode) {
        return null;
    }

    @Override
    public T visit(ClassType classType) {
        return null;
    }

    @Override
    public T visit(ClassNode classNode) {
        ClassTypeSymbol classTypeSymbol =
                (ClassTypeSymbol) currentScope.resolve(classNode.name);
        classNode.scope = new LocalScope(classNode.name, currentScope);
        classTypeSymbol.members = classNode.scope;
        currentScope = classNode.scope;

        for (int i = 0; i < classNode.memberv.size(); i++) {
            classNode.memberv.get(i).accept(this);
        }
        for (int i = 0; i < classNode.memberf.size(); i++) {
            classNode.memberf.get(i).accept(this);
        }
        currentScope = currentScope.getEnclosingScope();
        return null;
    }

    @Override
    public T visit(BuiltInType builtInType) {
        return null;
    }

    @Override
    public T visit(BreakNode breakNode) {
        return null;
    }

    @Override
    public T visit(BoolLiteralNode boolLiteralNode) {
        return null;
    }

    @Override
    public T visit(BlockNode blockNode) {
        return null;
    }

    @Override
    public T visit(BinaryOpNode binaryOpNode) {
        return null;
    }

    @Override
    public T visit(ArrayType arrayType) {
        return null;
    }

    @Override
    public T visit(ArefNode arefNode) {
        return null;
    }
}
