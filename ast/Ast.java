/*Ast.java*/
package compiler.Ast;
import compiler.lib.ErrorHandler;
import compiler.parse.CC4Parser;
public class Ast{
	public Ast(FileOutputStream out){
		CC4Parser c = new CC4Parser(out);
		out.write("stage: CC4Parser");
	}
}