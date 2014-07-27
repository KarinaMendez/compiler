import java.util.ArrayList;
import lib.ErrorHandler;

public class Compiler{
	public static void main(String[] args) {
		if (args.length>0){
			if ( args.length==1){
				if(args[0].contains(".")){
					System.out.println("hacer todo");	
				}else{
					ErrorHandler e = new ErrorHandler("not existing file");
				}
			}
			String filename = args[args.length-1];
			ArrayList<String> options = new ArrayList<String>();
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
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
						}
						break;
					default:
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
		}
	}
}