import AST.AST;
import Symbols.GlobalScope;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.util.Scanner;

public class SemanticCheck {
    static public void main(String[] args) throws Exception{
        String pos = "/home/yanhongyu/Git/homework/Compiler/test/semantic/testcase_693.txt";
        FileInputStream fin = new FileInputStream(pos);
        ANTLRInputStream input = new ANTLRInputStream(fin);
        grammarsLexer lexer = new grammarsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grammarsParser parser = new grammarsParser(tokens);
        ParseTree tree = parser.prog();

        BuildASTVisitor vst = new BuildASTVisitor();
        AST root = (AST)vst.visit(tree);
        PrintASTVisitor<Void> printer = new PrintASTVisitor<Void>(System.err);
        printer.visit(root);
        root.scope = new GlobalScope();

        DefPhase<Void> defPhase = new DefPhase<>(root.scope);
        defPhase.visit(root);
        RefPhase<Void> refPhase = new RefPhase<>(root.scope);
        refPhase.visit(root);
    }
}
