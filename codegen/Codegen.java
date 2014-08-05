/*Codegen.java*/
import 
import compiler.lib.ErrorHandler;
public class Codegen{
	public Codegen(String s){
		try{
			InputStream in = new FileInputStream(s);
		} catch (FileNotFoundException e) {
    		ErrorHandler e = new ErrorHandler("not existing file");
		} catch (IOException e) {
		    ErrorHandler e = new ErrorHandler("not existing file");
		}
	}
}