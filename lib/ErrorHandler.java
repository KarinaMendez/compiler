<<<<<<< HEAD
package lib;
/*ErrorHandler.java*/
=======
package compiler.lib;

/*ErrorHandler.java*/
 
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec

public class ErrorHandler{

	public ErrorHandler(String e){
		switch(e){
			case "no arguments":
<<<<<<< HEAD
				System.err.println("Didn't receive any arguments");
				System.exit(0);
				break;
			case "not existing file":
				System.err.println("Not existing file");
				System.exit(0);
				break;
			case "missing -o complement":
				System.err.println("error falta el argumento que complementa a -o");
				System.exit(0);
				break;
			case "missing -target complement":
				System.err.println("error falta el argumento que complementa a -target");
				System.exit(0);
				break;
			case "missing -opt complement":
				System.err.println("error falta el argumento que complementa a -opt");
				System.exit(0);
				break;
			case "missing -debug complement":
				System.err.println("error falta el argumento que complementa a -debug");
				System.exit(0);
				break;
			default:
				System.err.println("Error");
				System.exit(0);
=======
				System.out.println("Didn't receive any arguments");
				break;
			case "not existing file":
				System.out.println("Not existing file");
				break;
			default:
				System.out.println("Error");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
				break;
		}
	}
}