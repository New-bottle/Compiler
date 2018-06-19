package BackEnd;

import IR.*;
import AST.*;
import SemanticCheck.*;
import FrontEnd.*;
import Symbols.*;
import grammars.grammarsLexer;
import grammars.grammarsParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

public class IrGenerateTest {
    static public void main(String[] args) throws Exception{
        String pos = "/home/hongyuyan/Git/homework/Compiler/test/IR/testfunc.txt";
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

        BuildIRVisitor buildIRVisitor = new BuildIRVisitor(root.scope);
        IRInstruction irroot = (IRInstruction) buildIRVisitor.visit(root);
        IRPrinter irPrinter = new IRPrinter();
        irPrinter.visit(irroot);
    }
}
