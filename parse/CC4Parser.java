/*CC4Parser.java*/
package compiler.parse;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.scanner.Scanner;
public class CC4Parser{
	public CC4Parser(PrintWriter out){
		Scanner s = new Scanner(out);
		out.println("stage: parsing");
	}
}