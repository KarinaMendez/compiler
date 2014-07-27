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
<<<<<<< HEAD
					ErrorHandler e = new ErrorHandler("not existing file");
				}
			}
			String filename = args[args.length-1];
=======
					//error 
					System.out.println("not existing file");
				}
			}
			String filename = args[args.length-1];
			if(!filename.contains(".")){
				
				System.out.println("not existing file");
			}
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
			ArrayList<String> options = new ArrayList<String>();
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
<<<<<<< HEAD
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-'){
								ErrorHandler e = new ErrorHandler("missing -o complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -o");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
							i++;
						}
						break;
					case "-target":
<<<<<<< HEAD
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -target complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -target");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
							i++;
						}
						break;
					case "-opt":
<<<<<<< HEAD
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -opt complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -opt");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
							i++;
						}
						break;
					case "-debug":
<<<<<<< HEAD
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -debug complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
=======
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -debug");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
							i++;
						}
						break;
					default:
<<<<<<< HEAD
						break;
				}				
			}
			System.out.println(options);
			for(int j = 0; j<options.size();j++){
				switch(options.get(j)){
					case "-o":
						System.out.println("el out name sera: " + options.get(j+1));
						j++;
						break;
					case "-target":
						System.out.println("se procedera hasta: " + options.get(j+1));
						j++;
						break;
					case "-opt":
						System.out.println("solo se optimizara: "+ options.get(j+1));
						j++;
						break;
					case "-debug":
						System.out.println("se debugueara: "+ options.get(j+1));
						j++;
						break;
					case "-h":
						System.out.println("Muestra esta ayuda al usuario.");
						break;
					default:
						break;
				}
			}
		}else{
			ErrorHandler e = new ErrorHandler("no arguments");
=======
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

>>>>>>> e3e91c8b29fcf18162a800bde8eca4511f8cbbec
		}
	}
}