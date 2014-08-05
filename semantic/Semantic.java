/*Semantic.java*/
package compiler.semantic;
import compiler.lib.ErrorHandler;
import compiler.ast.Ast;
public class Semantic{
	public Semantic(FileOutputStream out){
		Ast a = new Ast(out);
		out.write("stage: Ast");	
	}
}