package AST;

public interface ASTVisitor<T> {
    T visit(AST node);

    T visit(ArefNode arefNode);

    T visit(ArrayType arrayType);

    T visit(BinaryOpNode binaryOpNode);

    T visit(BlockNode blockNode);

    T visit(BreakNode breakNode);

    T visit(BuiltInType builtInType);

    T visit(ClassNode classNode);

    T visit(ClassType classType);

    T visit(ContinueNode continueNode);

    T visit(ExprNode exprNode);

    T visit(ExprStmtNode exprStmtNode);

    T visit(ForNode forNode);

    T visit(FuncDeclNode funcDeclNode);

    T visit(FunctionCallNode functionCallNode);

    T visit(FunctionType functionType);

    T visit(IfNode ifNode);

    T visit(IntegerLiteralNode integerLiteralNode);

    T visit(LiteralNode literalNode);

    T visit(MemberNode memberNode);

    T visit(MemberFuncNode memberFuncNode);

    T visit(NewExpr newExpr);

    T visit(PostOpNode postOpNode);

    T visit(ReturnNode returnNode);

    T visit(StmtNode stmtNode);

    T visit(StringLiteralNode stringLiteralNode);

    T visit(ThisNode thisNode);

    T visit(TypeDefinition typeDefinition);

    T visit(UnaryExprNode unaryExprNode);

    T visit(VariableDecl variableDecl);

    T visit(VariableNode variableNode);

    T visit(WhileNode whileNode);
}
