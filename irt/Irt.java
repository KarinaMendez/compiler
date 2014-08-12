/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.semantic.Semantic;
public class Irt{
	Semantic s;
	public Irt()throws Exception{
		this.s = new Semantic();
	}
	public String stage(){
		return s.stage() +"stage: semantic \n";
	}
}