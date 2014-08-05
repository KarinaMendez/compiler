/*Codegen.java*/
package compiler.codegen;

import java.io.*;
import compiler.irt.Irt;
import compiler.lib.ErrorHandler;
public class Codegen{
	public Codegen(FileOutputStream out){
		Irt i = new Irt(out);
		out.write("stage: generating code");
	}
}