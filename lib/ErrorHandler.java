package lib;
/*ErrorHandler.java*/
 

public class ErrorHandler{

	public ErrorHandler(String e){
		switch(e){
			case "no arguments":
<<<<<<< HEAD
				System.err.println("no se recibio ningun argumento");
				break;
			case "not existing file":
				System.err.println("not existing file");
				break;
			case "no argument for -o":
				System.err.println("error falta el argumento que complementa a -o");
				break;
			case "no argument for -target":
				System.err.println("error falta el argumento que complementa a -target");
				break;
			case "no argument for -opt":
				System.err.println("error falta el argumento que complementa a -opt");
				break;
			case "not existing file":
				System.err.println("not existing file");
=======
				System.out.println("Didn't receive any arguments");
				break;
			case "not existing file":
				System.out.println("Not existing file");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
				break;
			default:
				System.err.println("Error");
				break;
		}
	}
}