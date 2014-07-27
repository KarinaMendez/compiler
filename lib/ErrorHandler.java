package compiler.lib;

/*ErrorHandler.java*/
 

public class ErrorHandler{

	public ErrorHandler(String e){
		switch(e){
			case "no arguments":
				System.out.println("Didn't receive any arguments");
				break;
			case "not existing file":
				System.out.println("Not existing file");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}