/*Codegen.java*/
package compiler.codegen;

import java.io.*;
import compiler.irt.Irt;
import compiler.lib.ErrorHandler;
public class Codegen{
	public Codegen(Writer out)throws Exception{
		Irt i = new Irt(out);
		out.write("stage: generating code");
	}
}