import FrontEnd.AST.AST;
import FrontEnd.SemanticCheck.FirstPhase;
import FrontEnd.SemanticCheck.LastPhase;
import FrontEnd.SemanticCheck.SecondPhase;
import FrontEnd.Symbols.GlobalScope;
import FrontEnd.grammars.grammarsLexer;
import FrontEnd.grammars.grammarsParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

import AST.*;
import Symbols.*;
import SemanticCheck.*;

public class SemanticTest {
    static public void main(String[] args) throws Exception{
        InputStream fin = new FileInputStream("program.txt");
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

        FirstPhase<Void> firstPhase = new FirstPhase<>(root.scope);
        firstPhase.visit(root);
        SecondPhase<Void> secondPhase = new SecondPhase<>(root.scope);
        secondPhase.visit(root);
        LastPhase<Void> lastPhase = new LastPhase<>(root.scope);
        lastPhase.visit(root);
    }
}
