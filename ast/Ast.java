/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.parse.CC4Parser;
public class Ast{
	public Ast(PrintWriter out){
		CC4Parser c = new CC4Parser(out);
		out.println("stage: CC4Parser");
	}
}