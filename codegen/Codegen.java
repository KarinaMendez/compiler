/*Codegen.java*/
package compiler.codegen;

import java.io.*;
import compiler.irt.Irt;
import compiler.lib.Printer;
public class Codegen{
	Irt i ;
	public Codegen(String name)throws Exception{
		Printer out = new Printer(name, "flag");
		this.i = new Irt(out);
		out.println("stage: generating code");
		out.close();
	}
}