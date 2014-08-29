/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.Printer;
import compiler.ast.Ast;
public class Semantic{
	Ast a;
	public Semantic(Printer out)throws Exception{
		this.a = new Ast(out);
		out.println("stage: Ast \n");
	}
}