import java.util.ArrayList;
<<<<<<< HEAD
import lib.ErrorHandler;
=======
import compiler.lib.ErrorHandler;
import compiler.scanner.Scanner;
import compiler.parse.CC4Parser;
import compiler.ast.Ast;
import compiler.semantic.Semantic;
import compiler.irt.Irt;
import compiler.codegen.Codegen;


>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
public class Compiler{
	public static void main(String[] args) {

		if (args.length>0){
			if ( args.length==1){
				if(args[0].contains(".")){
					System.out.println("hacer todo");	
				}else{
					//error 
<<<<<<< HEAD
					ErrorHandler e = new ErrorHandler("not existing file");
=======
					System.out.println("not existing file");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
				}
			}
			String filename = args[args.length-1];
			if(!filename.contains(".")){
<<<<<<< HEAD
				//error
				ErrorHandler e = new ErrorHandler("not existing file");
=======
				
				System.out.println("not existing file");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
			}
			ArrayList<String> options = new ArrayList<String>();
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
						if(args[i+1].contains("-")){
<<<<<<< HEAD
							ErrorHandler e = new ErrorHandler("no argument for -o");
						}else{
							i++;
=======
							System.out.println("error falta el argumento que complementa a -o");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					case "-target":
<<<<<<< HEAD
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							ErrorHandler e = new ErrorHandler("no argument for -target");
						}else{
							i++;
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -target");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					case "-opt":
<<<<<<< HEAD
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							ErrorHandler e = new ErrorHandler("no argument for -opt");
						}else{
							i++;
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -opt");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					case "-debug":
<<<<<<< HEAD
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							System.out.print("error falta el argumento que complementa a -debug");
						}else{
							i++;
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -debug");
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					default:
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
				}
				for(int j = 0; j<options.size();j++){
					switch(options.get(j)){
						case "-o":
							System.out.println("el out name sera: " + args[j+1]);
							j++;
							break;
						case "-target":
							String x = args[j+1];
							System.out.println("se procedera hasta: " + x);
							switch(x){
								case "scan":
								break;
								case "parse":
								break;
								case "ast":
								break;
								case "semantic":
								break;
								case "irt":
								break;
								case "codegen":
								break;
							}
							j++;
							break;
						case "-opt":
							System.out.println("solo se optimizara: "+ args[j+1]);
							j++;
							break;
						case "-debug":
							System.out.println("se debugueara: "+ args[j+1]);
							j++;
							break;
						case "-h":
							System.out.println("Muestra esta ayuda al usuario.");
							break;
						default:
							break;
					}
				}

				
			}
		}else{
			//error

		}
	}
}