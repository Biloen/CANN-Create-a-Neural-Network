package SymbolTable;

import ASTGenerator.ASTGenerator;
import Nodes.BaseNode;
import gen.CANNLexer;
import gen.CANNParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class SymbolTableVisitorTest {
    BaseNode start(String simpleInput)
    {
        CharStream inputStream = CharStreams.fromString(simpleInput);
        CANNLexer lexer = new CANNLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CANNParser parser = new CANNParser(tokenStream);

        CANNParser.ProgContext cst = parser.prog();

        System.out.println(cst.toStringTree(parser));
        ASTGenerator astBuilder = new ASTGenerator(cst);
        BaseNode topNode = astBuilder.generateAST();

        return topNode;
    }

}
