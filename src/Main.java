import ASTVisitors.SymbolTableVisitor;
import CSTGenerator.CSTGenerator;
import Nodes.BaseNode;

import ASTGenerator.*;
import Nodes.TopNode;
import SemanticAnalyzer.SemanticAnalyzer;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class Main {
    public static void main(String []args) {
       CSTGenerator myCSTGenerator = new CSTGenerator();
       myCSTGenerator.BuildParser("src/playground");

       ASTGenerator astBuilder = new ASTGenerator(myCSTGenerator.RetrieveParser());
       BaseNode AStree = astBuilder.generateAST();

       SemanticAnalyzer analyzer = new SemanticAnalyzer(AStree);
       analyzer.Analyze();
       analyzer.HandleErrors();

       //FunnyVisitor fv = new FunnyVisitor();
       //AStree.Accept(fv);
       /* USE WITH INPUT3 TO POKE AROUND SYMBOL TABLE
       SymbolTable t = new SymbolTable();
       SymbolTableVisitor tableVisitor = new SymbolTableVisitor(t);
       AStree.Accept(tableVisitor);
       if (t.ContainsSymbol("n")) System.out.println("n is in the table in Main!");
       if (t.ContainsSymbol("p")) System.out.println("p is in the table in Main!");
       if (t.ContainsSymbol("myVec")) System.out.println("myVec is in the table in Main!");
       if (t.ContainsSymbol("myMtrx")) System.out.println("myMtrx is in the table in Main!");
       if (t.ContainsSymbol("mine")) System.out.println("mine is in the table in Main!");
       if (t.ContainsSymbol("poo")) System.out.println("poo is in the table in Main!");
        */

//for (BaseNode childNode: AStree.children) {
  //  System.out.println(childNode + "   " + childNode.children);
//}
    }
}
