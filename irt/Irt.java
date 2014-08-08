/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.semantic.Semantic;
public class Irt{
	public Irt(PrintWriter out){
		Semantic s = new Semantic(out);
		out.println("stage: semantic");
	}
}