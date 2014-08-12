/*CC4Parser.java*/
package compiler.parse;
import java.io.*;
import compiler.lib.ErrorHandler;
import compiler.scanner.Scanner;
public class CC4Parser{
	Scanner s;
	public CC4Parser()throws Exception{
		this.s = new Scanner();
	}
	public String stage(){
		return s.stage() +"stage: parsing \n";
	}
}