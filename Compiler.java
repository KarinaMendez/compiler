import java.util.ArrayList;
import lib.ErrorHandler;
public class Compiler{
	public static void main(String[] args) {

		if (args.length>0){
			if ( args.length==1){
				if(args[0].contains(".")){
					System.out.print("hacer todo");	
				}else{
					//error 
					ErrorHandler e = new ErrorHandler("not existing file");
				}
			}
			String filename = args[args.length-1];
			if(!filename.contains(".")){
				//error
				ErrorHandler e = new ErrorHandler("not existing file");
			}
			ArrayList<String> options = new ArrayList<String>();
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
						if(args[i+1].contains("-")){
							ErrorHandler e = new ErrorHandler("no argument for -o");
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
						}
						break;
					default:
						if(!options.contains(args[i])){
							options.add(args[i]);
						}
						break;
				}
				for(int j = 0; i<options.size();j++){
					switch(options.get(i)){
						case "-o":
							System.out.print("el out name sera: " + options.get(i+1));
							i++;
							break;
						case "-target":
							System.out.print("se procedera hasta: " + options.get(i+1));
							i++;
							break;
						case "-opt":
							System.out.print("solo se optimizara: "+ options.get(i+1));
							i++;
							break;
						case "-debug":
							System.out.print("se debugueara: "+ options.get(i+1));
							i++;
							break;
						case "-h":
							System.out.print("Muestra esta ayuda al usuario.");
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