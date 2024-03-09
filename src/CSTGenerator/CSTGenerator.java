package CSTGenerator;

import gen.CANNLexer;
import gen.CANNParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;

public class CSTGenerator {
    public String input;
    public CANNParser.ProgContext cst;

    public CSTGenerator() {
    }
    public void BuildParser(String filePath) throws ParseCancellationException
    {
        try {
            CharStream inputStream = CharStreams.fromFileName(filePath);
            CANNLexer lexer = new CANNLexer(inputStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(VerboseListener.INSTANCE);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CANNParser parser = new CANNParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(VerboseListener.INSTANCE);
            cst = parser.prog();
        }


        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParseCancellationException e)
        {
                System.out.println("ERROR    " + e.getMessage());
                System.exit(1);
        };

    }

    public CANNParser.ProgContext RetrieveParser()
    {
        return cst;
    }
}

