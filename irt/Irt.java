/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.semantic.Semantic;
public class Irt{
	public Irt(Writer out)throws Exception{
		Semantic s = new Semantic(out);
		out.write("stage: semantic");
	}
}