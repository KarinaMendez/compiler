/*CC4Parser.java*/
package compiler.parse;
import java.io.*;
import compiler.lib.Printer;
import compiler.scanner.Scanner;
public class CC4Parser{
	Scanner s;
	public CC4Parser(Printer out)throws Exception{
		this.s = new Scanner(out);
		out.println("stage: parsing \n");
	}
}