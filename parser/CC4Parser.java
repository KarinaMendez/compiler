/*CC4Parser.java*/
package compiler.parse;
import compiler.lib.ErrorHandler;
import compiler.scanner.Scanner;
public class CC4Parser{
	public CC4Parser(FileOutputStream out){
		Scanner s = new Scanner(out);
		out.write("stage: parsing");
	}
}