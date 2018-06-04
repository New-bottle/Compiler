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
import SemanticCheck.*;

public class SemanticJudge {
    static public void main(String[] args) throws Exception{
        String pos = "/home/yanhongyu/Git/homework/Compiler/test/semantic/testcase_757.txt";
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

        FirstPhase<Void> firstPhase = new FirstPhase<>(root.scope);
        firstPhase.visit(root);
        SecondPhase<Void> secondPhase = new SecondPhase<>(root.scope);
        secondPhase.visit(root);
        LastPhase<Void> lastPhase = new LastPhase<>(root.scope);
        lastPhase.visit(root);
    }
}
