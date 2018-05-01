import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.util.Scanner;

import AST.*;
import Symbols.*;

public class SemanticTest {
    static public void main(String[] args) throws Exception{
        String pos = "/home/yanhongyu/Git/homework/Compiler/Parser/"
                + "src/test/parser/sample2.mm";
        FileInputStream fin = new FileInputStream(pos);
        Scanner sc = new Scanner(fin);
        String expr = "";
        while (sc.hasNextLine()) {
            expr = expr + '\n' + sc.nextLine();
        }

        ANTLRInputStream input = new ANTLRInputStream(expr);
        grammarsLexer lexer = new grammarsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grammarsParser parser = new grammarsParser(tokens);
        ParseTree tree = parser.prog();

        BuildASTVisitor vst = new BuildASTVisitor();
        AST root = (AST)vst.visit(tree);
        PrintASTVisitor<Void> printer = new PrintASTVisitor<Void>(System.out);
        printer.visit(root);
        root.scope = new GlobalScope();

        DefPhase<Void> defPhase = new DefPhase<>(root.scope);
        defPhase.visit(root);
        RefPhase<Void> refPhase = new RefPhase<>(root.scope);
        refPhase.visit(root);
    }
}
