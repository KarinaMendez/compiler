/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.Printer;
import compiler.parse.CC4Parser;
public class Ast{
	CC4Parser c;
	public Ast(Printer out)throws Exception{
		this.c = new CC4Parser(out);
		out.println("stage: CC4Parser \n");	}
}