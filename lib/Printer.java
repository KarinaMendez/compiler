package compiler.lib;
import java.io.*;
public class Printer {
	static PrintWriter out;
	public Printer(String name) throws Exception{
		out = new PrintWriter(new FileWriter(name));
	}
	public Printer(String name, String file) throws Exception{
		out = new PrintWriter(new File(name));
	}
	public void print(String s){
		out.print(s);
	}
	public void println(String s){
		out.println(s);
	}
	public void close(){
		out.close();
	}
}