import java.util.ArrayList;
<<<<<<< HEAD
import compiler.lib.ErrorHandler;
/*import compiler.scanner.Scanner;
import compiler.parse.CC4Parser;
import compiler.ast.Ast;
import compiler.semantic.Semantic;
import compiler.irt.Irt;
import compiler.codegen.Codegen;*/

=======
import lib.ErrorHandler;
>>>>>>> master
public class Compiler{
	public static void main(String[] args) {

		if (args.length>0){
			if (args.length==1){
				if(args[0].equals("-h")){
					System.out.println("Esta es una ayuda para el usuario, opciones disponibles: ");
					System.out.println("-o");
					System.out.println("-target");
					System.out.println("-opt");
					System.out.println("-debug");
					System.exit(0);
				}
				if(args[0].contains(".")){
					System.out.println("hacer todo");	
				}else{
<<<<<<< HEAD
=======
					//error 
>>>>>>> master
					ErrorHandler e = new ErrorHandler("not existing file");
				}
			}
			String filename = args[args.length-1];
<<<<<<< HEAD
=======
			if(!filename.contains(".")){
				//error
				ErrorHandler e = new ErrorHandler("not existing file");
			}
>>>>>>> master
			ArrayList<String> options = new ArrayList<String>();
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
<<<<<<< HEAD
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
							i++;
						}
						break;
					case "-target":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -target complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
							i++;
						}
						break;
					case "-opt":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -opt complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
							i++;
						}
						break;
					case "-debug":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -debug complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
							i++;
=======
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							System.out.print("error falta el argumento que complementa a -o");
=======
						if(args[i+1].contains("-")){
							ErrorHandler e = new ErrorHandler("no argument for -o");
>>>>>>> master
						}else{
							i++;
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					case "-target":
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							ErrorHandler e = new ErrorHandler("no argument for -target");
						}else{
							i++;
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					case "-opt":
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							ErrorHandler e = new ErrorHandler("no argument for -opt");
						}else{
							i++;
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
					case "-debug":
						if(args[i+1].contains("-")&&args[i+1].contains(".")){
							System.out.print("error falta el argumento que complementa a -debug");
						}else{
							i++;
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
>>>>>>> 5161c36a853998fab132267f271f0da47ef85e98
						}
						break;
					default:
						break;
				}				
			}
			if(options.size()>2){
				System.out.println("si entra aqui");
				switch(options.get(options.size()-2)){
					case "-o":
						System.out.println("el out name sera: " + options.get(options.size()-1));
						break;
					case "-target":
						System.out.println("se procedera hasta: " + options.get(options.size()-1));
						break;
					case "-opt":
						System.out.println("solo se optimizara: "+ options.get(options.size()-1));
						break;
					case "-debug":
						System.out.println("se debugueara: "+ options.get(options.size()-1));
						break;
					case "-h":
						System.out.println("Muestra esta ayuda al usuario.");
						break;
					default:
						break;
				}
			}else{
				switch(options.get(0)){
					case "-o":
						System.out.println("el out name sera: " + options.get(1));
						break;
					case "-target":
						System.out.println("se procedera hasta: " + options.get(1));
						break;
					case "-opt":
						System.out.println("solo se optimizara: "+ options.get(1));
						break;
					case "-debug":
						System.out.println("se debugueara: "+ options.get(1));
						break;
					case "-h":
						System.out.println("Muestra esta ayuda al usuario.");
						break;
					default:
						break;
				}
			}
		}else{
			System.out.println("Esta es una ayuda para el usuario, opciones disponibles: ");
			System.out.println("-o");
			System.out.println("-target");
			System.out.println("-opt");
			System.out.println("-debug");
			System.exit(0);
			//ErrorHandler e = new ErrorHandler("no arguments");
		}
	}
}