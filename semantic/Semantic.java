/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.ast.Ast;
public class Semantic{
	Ast a;
	public Semantic()throws Exception{
		this.a = new Ast();
	}
	public String stage(){
		return a.stage() +"stage: Ast \n";
	}
}