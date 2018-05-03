import AST.*;
import Symbols.*;
import Exception.*;

import static Symbols.Symbol.getType;

public class RefPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;
    public int inloop;
    public Type funcReturnType;
    public boolean newBlockScope;

    public RefPhase (Scope currentScope) {
        this.currentScope = currentScope;
        this.funcReturnType = null;
        inloop = 0;
        newBlockScope = true;
    }

    @Override
    public T visit(AST node) {
        for (int i = 0; i < node.comps.size(); i++) {
            node.comps.get(i).accept(this);
        }
        Symbol main = currentScope.resolve("main");
        if (!(main instanceof FunctionTypeSymbol)) {
            throw new MainError("Program don't have a Main Function!");
        }
        if (((FunctionTypeSymbol)main).argNames.size() != 0) {
            throw new MainError("Main Function shouldn't have args!");
        }
        if (!((FunctionTypeSymbol)main).returnType.equals(new BuiltInTypeSymbol(Symbol.Types.INT))) {
            throw new MainError("Main Function should return an INT!");
        }
        return null;
    }

    @Override
    public T visit(ArefNode arefNode) {
        arefNode.name.accept(this);
        if (!(currentScope.resolve(arefNode.name.exprType) instanceof ArraySymbol)) {
            throw new TypeError(arefNode.name.toString() + " is not an array.");
        }
//        ArraySymbol arraySymbol = (ArraySymbol) currentScope.resolve(arefNode.name.exprType);
        arefNode.exprType = ((ArrayType)arefNode.name.exprType).baseType;
        return null;
    }

    @Override
    public T visit(ArrayType arrayType) {
        if (arrayType.baseType.getType() == Symbol.Types.VOID) {
            throw new TypeError("Can't make array of VOID.");
        }
        currentScope.resolve(arrayType.baseType);
        return null;
    }

    @Override
    public T visit(BinaryOpNode binaryOpNode) {
        binaryOpNode.left.accept(this);
        binaryOpNode.right.accept(this);

        if (binaryOpNode.op == BinaryOpNode.BinaryOp.ASSIGN) {
            if (!binaryOpNode.left.isLvalue) {
                throw new AssignError(binaryOpNode.left.toString() +" is not a Lvalue.");
            }
            if (!binaryOpNode.left.exprType.equals(binaryOpNode.right.exprType)) {
                if (binaryOpNode.right.exprType != null) {
                    String err = '(' + binaryOpNode.left.exprType.getType().name() + " " + binaryOpNode.op.name() + " "
                            + binaryOpNode.right.exprType.getType().name() + ')';
                    throw new TypeError("BinaryOp : " + err);
                } else {
                    if (!(binaryOpNode.left.exprType.getType() == Symbol.Types.STRUCT ||
                        binaryOpNode.left.exprType.getType() == Symbol.Types.ARRAY)) {
                        throw new TypeError("Can't assign null to a " + binaryOpNode.left.exprType.getType().name() + " variable.");
                    }
                }
            }
        } else {
            if (!binaryOpNode.left.exprType.equals(binaryOpNode.right.exprType)) {
                String err = '(' + binaryOpNode.left.exprType.getType().name() + " " + binaryOpNode.op.name() + " "
                        + binaryOpNode.right.exprType.getType().name() + ')';
                throw new TypeError("BinaryOp : " + err);
            }
            if (!binaryOpNode.left.exprType.getType().equals(Symbol.Types.INT) &&
                    !binaryOpNode.left.exprType.equals(new ClassType("string")) &&
                    !binaryOpNode.left.exprType.getType().equals(Symbol.Types.BOOL)) {
                throw new TypeError("BinaryOp computing non-builtin type.");
            }
            switch (binaryOpNode.op) {
                case EQ: case GE: case GT:case LE:case LT:case NE:case LAND:case LOR:
                    binaryOpNode.exprType = new BuiltInType(Symbol.Types.BOOL); break;
                default:
                    binaryOpNode.exprType = binaryOpNode.left.exprType;
            }
        }
        return null;
    }

    @Override
    public T visit(BlockNode blockNode) {
        boolean built = false;
        if (newBlockScope == true) {
            blockNode.scope = new LocalScope("Block", currentScope);
            currentScope = blockNode.scope;
            built = true;
        } else {
            newBlockScope = true;
        }

        for (int i = 0; i < blockNode.stmts.size(); i++) {
            blockNode.stmts.get(i).accept(this);
        }
        if (built) {
            currentScope = currentScope.getEnclosingScope();
        }
        return null;
    }

    @Override
    public T visit(BoolLiteralNode boolLiteralNode) {
        boolLiteralNode.exprType = new BuiltInType(Symbol.Types.BOOL);
        return null;
    }

    @Override
    public T visit(BreakNode breakNode) {
        if (inloop == 0) {
            throw new JumpError("Not in a loop, can't break.");
        }
        return null;
    }

    @Override
    public T visit(BuiltInType builtInType) {
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
    public T visit(ClassType classType) { //currentScope.resolve(classType.name);
        return null;
    }

    @Override
    public T visit(ContinueNode continueNode) {
        if (inloop == 0) {
            throw new JumpError("Not in a loop, can't continue,");
        }
        return null;
    }

    @Override
    public T visit(ExprNode exprNode) {
        return null;
    }

    @Override
    public T visit(ExprStmtNode exprStmtNode) {
        exprStmtNode.expr.accept(this);
        return null;
    }

    @Override
    public T visit(ForNode forNode) {
        if (forNode.initWithDecl != null) {
            newBlockScope = false;
            forNode.initWithDecl.accept(this);
        }
        else forNode.init.accept(this);
        inloop ++;
        forNode.cond.accept(this);
        forNode.iter.accept(this);
        forNode.body.accept(this);
        inloop --;
        if (forNode.initWithDecl != null)
            newBlockScope = true;
        return null;
    }

    @Override
    public T visit(FuncDeclNode funcDeclNode) {
        newBlockScope = false;
        funcReturnType = funcDeclNode.type;
        if (currentScope.getEnclosingScope() != null) { // class member func
            TypeSymbol returnTypeSymbol = (TypeSymbol) currentScope.resolve(funcDeclNode.type);
            FunctionTypeSymbol funcSymbol = new FunctionTypeSymbol(returnTypeSymbol, funcDeclNode.name);
            currentScope.define(funcDeclNode.name, funcSymbol);
        }
        FunctionTypeSymbol funcSymbol =
                (FunctionTypeSymbol)currentScope.resolve(funcDeclNode.name);
        funcDeclNode.scope = new LocalScope(funcDeclNode.name, currentScope);
        currentScope = funcDeclNode.scope;
        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                VariableDecl vard = funcDeclNode.parameters.get(i);
                TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(vard.type);
                currentScope.define(vard.name, new VariableSymbol(typeSymbol, vard.name));
                funcSymbol.addArg(typeSymbol, vard.name);
            }
        }

        funcDeclNode.body.accept(this);
        currentScope = currentScope.getEnclosingScope();
        funcReturnType = null;
        return null;
    }

    @Override
    public T visit(FunctionCallNode functionCallNode) {
        Symbol sym = currentScope.resolve(functionCallNode.name);
        if (sym == null) {
            throw new RuntimeException("FunctionCall failed: No such symbol.");
        }
        if (sym.type != Symbol.Types.FUNCTION) {
            throw new RuntimeException("FunctionCall failed: Symbol is not a function.");
        }
        FunctionTypeSymbol funcSymbol = (FunctionTypeSymbol) sym;
        if (functionCallNode.parameters != null) {
            for (int i = 0; i < functionCallNode.parameters.size(); i++) {
                functionCallNode.parameters.get(i).accept(this);
                Symbol.Types type1 = functionCallNode.parameters.get(i).exprType.getType();
                Symbol.Types type2 = funcSymbol.argTypes.get(i).type;
                if (!type1.equals(type2)) {
                    if (!((type1 == Symbol.Types.STRUCT || type1 == Symbol.Types.ARRAY) &&
                            type2 == Symbol.Types.NULL)) {
                        throw new TypeError("Function parameter type error when calling " + functionCallNode.name);
                    }
                }
            }
        }
        functionCallNode.exprType = getType(funcSymbol.returnType);
        return null;
    }

    @Override
    public T visit(FunctionType functionType) {
        return null;
    }

    @Override
    public T visit(IfNode ifNode) {
        ifNode.cond.accept(this);
        if (ifNode.cond.exprType.getType() != Symbol.Types.BOOL) {
            throw new TypeError("Need a boolean expression but got a : "+ifNode.cond.exprType.getType().name());
        }
        ifNode.then.accept(this);
        if (ifNode.otherwise != null)
            ifNode.otherwise.accept(this);
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
        memberNode.expr.accept(this);
        ClassTypeSymbol classTypeSymbol =
                (ClassTypeSymbol)currentScope.resolve(memberNode.expr.exprType);
        try {
            classTypeSymbol.members.find(memberNode.name);
        } catch (RuntimeException e) {
            throw new MemberError(classTypeSymbol.name+" don't have member var " + memberNode.name);
        }
        memberNode.exprType = getType(classTypeSymbol.members.find(memberNode.name));
        return null;
    }

    @Override
    public T visit(MemberFuncNode memberFuncNode) {
        memberFuncNode.expr.accept(this);
        Symbol sym = currentScope.resolve(memberFuncNode.expr.exprType);
        if (sym instanceof ClassTypeSymbol) {
            ClassTypeSymbol classTypeSymbol = (ClassTypeSymbol) sym;
            try {
                classTypeSymbol.members.find(memberFuncNode.name);
            } catch (RuntimeException e) {
                throw new MemberError(classTypeSymbol.name + " don't have member func " + memberFuncNode.name);
            }
            memberFuncNode.exprType = getType(classTypeSymbol.members.find(memberFuncNode.name));
        } else {
            ArraySymbol arraySymbol = (ArraySymbol) sym;
            try {
                arraySymbol.members.find(memberFuncNode.name);
            } catch (RuntimeException e) {
                throw new MemberError("Array don't have this member function " + memberFuncNode.name);
            }
            memberFuncNode.exprType = new BuiltInType(Symbol.Types.INT);
        }
        return null;
    }

    @Override
    public T visit(NewExpr newExpr) {
        newExpr.type.accept(this);
        return null;
    }

    @Override
    public T visit(NullNode nullNode) {
        return null;
    }

    @Override
    public T visit(PostOpNode postOpNode) {
        postOpNode.expr.accept(this);
        if (!postOpNode.expr.isLvalue) {
            throw new AssignError("PostOp " + postOpNode.expr.toString()+" is not a L value.");
        }
        postOpNode.exprType = postOpNode.expr.exprType;
        return null;
    }

    @Override
    public T visit(ReturnNode returnNode) {
        if (funcReturnType == null) {
            throw new JumpError("Not in a function, can't return!");
        }
        if (returnNode.expr == null) {
            if (funcReturnType.getType() != Symbol.Types.VOID) {
                throw new TypeError("Function return type error!");
            }
        } else {
            returnNode.expr.accept(this);
            if (!funcReturnType.equals(returnNode.expr.exprType)) {
                if (funcReturnType.getType() == Symbol.Types.STRUCT ||
                    funcReturnType.getType() == Symbol.Types.ARRAY) {
                    if (returnNode.expr.exprType.getType() != Symbol.Types.NULL) {
                        throw new TypeError("Function return type error!");
                    }
                } else {
                    throw new TypeError("Function return type error!");
                }
            }
        }
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
    public T visit(UnaryExprNode unaryExprNode) {
        unaryExprNode.expr.accept(this);
        switch (unaryExprNode.op) {
            case ADD: case SUB:
                if (!unaryExprNode.expr.isLvalue) {
                    throw new AssignError("Can't do Prev ++/-- to a non-Lvalue.");
                }
                if (unaryExprNode.expr.exprType.getType() != Symbol.Types.INT) {
                    throw new TypeError("Can't do Prev ++/-- on a non-INT.");
                }
                break;
            case NEG:case POS:case BNOT:
                if (unaryExprNode.expr.exprType.getType() != Symbol.Types.INT) {
                    throw new TypeError("Can't do Prev +/-/~ on a non-INT.");
                }
                break;
            case LNOT:
                if (unaryExprNode.expr.exprType.getType() != Symbol.Types.BOOL) {
                    throw new TypeError("Can't do Prev ! on a non-BOOL.");
                }
                break;
        }
        unaryExprNode.isLvalue = false;
        unaryExprNode.exprType = unaryExprNode.expr.exprType;
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
                if (variableDecl.type.getType() == Symbol.Types.STRUCT) {
                    if (((ClassType)variableDecl.type).name == "string")
                        throw new TypeError("Initial expr's type doesn't match.");
                    if (variableDecl.init.exprType.getType() != Symbol.Types.NULL)
                        throw new TypeError("Initial expr's type doesn't match.");
                } else if (variableDecl.type.getType() == Symbol.Types.ARRAY) {
                    if (variableDecl.init.exprType.getType() != Symbol.Types.NULL)
                        throw new TypeError("Initial expr's type doesn't match.");
                } else
                    throw new TypeError("Initial expr's type doesn't match.");
            }
        }
        currentScope.define(variableDecl.name, new VariableSymbol(typeSymbol, variableDecl.name));
        return null;
    }

    @Override
    public T visit(VariableNode variableNode) {
        if (!(currentScope.resolve(variableNode.name) instanceof VariableSymbol))
            throw new TypeError("This symbol is not a var : " + variableNode.name);
        variableNode.exprType = getType(((VariableSymbol) currentScope.resolve(variableNode.name)).returntype);
        return null;
    }

    @Override
    public T visit(WhileNode whileNode) {
        inloop ++;
        whileNode.cond.accept(this);
        if (whileNode.cond.exprType.getType() != Symbol.Types.BOOL) {
            throw new TypeError("Need a boolean expression but got a : "+whileNode.cond.exprType.getType().name());
        }
        whileNode.body.accept(this);
        inloop --;
        return null;
    }
}
