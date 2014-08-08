/*Codegen.java*/
package compiler.codegen;

import java.io.*;
import compiler.irt.Irt;
import compiler.lib.ErrorHandler;
public class Codegen{
	public Codegen(PrintWriter out){
		Irt i = new Irt(out);
		out.println("stage: generating code");
	}
}