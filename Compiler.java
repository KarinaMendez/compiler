import java.util.ArrayList;
import java.io.*;
import compiler.lib.*;
import compiler.scanner.Scanner;
import compiler.parse.CC4Parser;
import compiler.ast.Ast;
import compiler.semantic.Semantic;
import compiler.irt.Irt;
import compiler.codegen.Codegen;

public class Compiler{
	public static void main(String[] args) throws Exception{
		if (args.length>0){
			String filename = args[args.length-1];
			String fileout="2"+filename;
			ArrayList<String> options = new ArrayList<String>();
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
					try{
						InputStream in = new FileInputStream(filename);
					} catch (FileNotFoundException p) {
			    		ErrorHandler error = new ErrorHandler("not existing file");
					}
					Printer out = new Printer(fileout);
					out.close();
					Codegen c = new Codegen(fileout);
				}else{
					ErrorHandler e = new ErrorHandler("not existing file");
				}
			}
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-'){
								ErrorHandler e = new ErrorHandler("missing -o complement");
							}else{
								fileout=args[i+1];
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
								switch(args[i+1]){
									case "scan":
										options.add(args[i+1]);
										i++;
										break;
									case "parse":
										options.add(args[i+1]);
										i++;
										break;
									case "ast":
										options.add(args[i+1]);
										i++;
										break; 
									case "semantic":
										options.add(args[i+1]);
										i++;
										break;
									case "irt":
										options.add(args[i+1]);
										i++;
										break;
									case "codegen":
										options.add(args[i+1]);
										i++;
										break;
									default:
										ErrorHandler e = new ErrorHandler("missing -target complement");
										break;
								}
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
						}
						break;
					default:
						break;
				}				
			}
			for(int j = 0; options.size()>j;j++){
				switch(options.get(options.size()-2)){
					case "-target":
						System.out.println("se procedera hasta: " + options.get(j));
						switch(options.get(j)){
									case "scan":
										try{
											InputStream in = new FileInputStream(filename);
										} catch (FileNotFoundException p) {
								    		ErrorHandler error = new ErrorHandler("not existing file");
										}
										Printer outs = new Printer("flag");
										Scanner s = new Scanner(outs);
										break;
									case "parse":
										try{
											InputStream in = new FileInputStream(filename);
										} catch (FileNotFoundException p) {
								    		ErrorHandler error = new ErrorHandler("not existing file");
										}
										Printer outpa = new Printer(fileout,"flag");
										CC4Parser sp = new CC4Parser(outpa);
										break;
									case "ast":
										try{
											InputStream in = new FileInputStream(filename);
										} catch (FileNotFoundException p) {
								    		ErrorHandler error = new ErrorHandler("not existing file");
										}
										Printer outas = new Printer(fileout, "flag");
										Ast a = new Ast(outas);
										break; 
									case "semantic":
										try{
											InputStream in = new FileInputStream(filename);
										} catch (FileNotFoundException p) {
								    		ErrorHandler error = new ErrorHandler("not existing file");
										}
										Printer outse = new Printer(fileout, "flag");
										Semantic ss = new Semantic(outse);
										break;
									case "irt":
										try{
											InputStream in = new FileInputStream(filename);
										} catch (FileNotFoundException p) {
								    		ErrorHandler error = new ErrorHandler("not existing file");
										}
										Printer outi = new Printer(fileout, "flag");
										Irt i = new Irt(outi);
										break;
									case "codegen":
										try{
											InputStream in = new FileInputStream(filename);
										} catch (FileNotFoundException p) {
								    		ErrorHandler error = new ErrorHandler("not existing file");
										}
										Codegen cc = new Codegen(fileout);
										break;
									default:
									ErrorHandler e = new ErrorHandler("missing -target complement");
									break;
								}
						break;
					case "-opt":
						System.out.println("solo se optimizara: "+ options.get(j));
						break;
					case "-debug":
						System.out.println("se debugueara: "+ options.get(j));
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
		}
	}
}