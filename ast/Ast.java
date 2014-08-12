/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.parse.CC4Parser;
public class Ast{
	CC4Parser c;
	public Ast()throws Exception{
		this.c = new CC4Parser();
	}
	public String stage(){
		return c.stage() +"stage: CC4Parser \n";
	}
}