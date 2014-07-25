package compiler.lib;

/*ErrorHandler.java*/
 

public class ErrorHandler(){

	public ErrorHandler(String e){
		Switch(e){
			case "no arguments":
				System.out.println("no se recibio ningun argumento");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}