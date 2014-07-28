package lib;
/*ErrorHandler.java*/
<<<<<<< HEAD
=======
 

>>>>>>> master
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
				break;
			default:
				System.err.println("Error");
>>>>>>> master
				break;
		}
	}
}