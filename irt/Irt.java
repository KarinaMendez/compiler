/*Irt.java*/
package compiler.irt;
import compiler.lib.ErrorHandler;
import compiler.semantic.Semantic;
public class Irt{
	public Irt(FileOutputStream out){
		Semantic s = new Semantic(out);
		out.write("stage: semantic");
	}
}