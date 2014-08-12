/*Codegen.java*/
package compiler.codegen;

import java.io.*;
import compiler.irt.Irt;
import compiler.lib.ErrorHandler;
public class Codegen{
	Irt i ;
	public Codegen()throws Exception{
		this.i = new Irt();
	}
	public String stage(){
		return i.stage() +"stage: generating code";
	}
}