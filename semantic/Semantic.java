/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.ast.Ast;
public class Semantic{
	public Semantic(Writer out)throws Exception{
		Ast a = new Ast(out);
		out.write("stage: Ast");	
	}
}