/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.ast.Ast;
public class Semantic{
	public Semantic(PrintWriter out){
		Ast a = new Ast(out);
		out.println("stage: Ast");	
	}
}