/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.parse.CC4Parser;
public class Ast{
	public Ast(Writer out)throws Exception{
		CC4Parser c = new CC4Parser(out);
		out.write("stage: CC4Parser");
	}
}