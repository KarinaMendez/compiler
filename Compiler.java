import java.util.ArrayList;
import compiler.lib.ErrorHandler;

public class Compiler{
	public static void main(String[] args) {
		if (args.length>0){
			if ( args.length==1){
				if(args[0].contains(".")){
					System.out.println("hacer todo");	
				}else{
					//error 
					System.out.println("not existing file");
				}
			}
			String filename = args[args.length-1];
			if(!filename.contains(".")){
				
				System.out.println("not existing file");
			}
			ArrayList<String> options = new ArrayList<String>();
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -o");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
							i++;
						}
						break;
					case "-target":
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -target");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
							i++;
						}
						break;
					case "-opt":
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -opt");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
							i++;
						}
						break;
					case "-debug":
						if(args[i+1].contains("-")){
							System.out.println("error falta el argumento que complementa a -debug");
						}
						if(!options.contains(args[i])){
							options.add(args[i]);
						}else if(!args[i+1].contains("-")){
							i++;
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