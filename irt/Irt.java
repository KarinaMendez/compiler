/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.Printer;
import compiler.semantic.Semantic;
public class Irt{
	Semantic s;
	public Irt(Printer out)throws Exception{
		this.s = new Semantic(out);
		out.println("stage: semantic \n");
	}
}