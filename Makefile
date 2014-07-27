make: Compiler.class scanner/Scanner.class parser/CC4Parser.class ast/Ast.class semantic/Semantic.class irt/Irt.class codegen/Codegen.class opt/Algebraic.class opt/ConstantFolding.class lib/Debug.class lib/ErrorHandler.class 
	
Compiler.class: Compiler.java
	javac Compiler.java
	
Scanner.class: scanner/Scanner.java
	javac Scanner.java

CC4Parser.class: parser/CC4Parser.java	
    javac CC4Parser.java

Ast.class: ast/Ast.java
    javac Ast.java

Semantic.class: semantic/Semantic.java
    javac Semantic.java

Irt.class: irt/Irt.java
    javac Irt.java

Codegen.class: codegen/Codegen.java
    javac Codegen.java

Algebraic.class: opt/Algebraic.java
    javac Algebraic.java
              
Algebraic.class: opt/ConstantFolding.java
	javac ConstantFolding.java

Debug.class: lib/Debug.java
    javac Debug.java

ErrorHandler.class: lib/ErrorHandler.java
	javac ErrorHandler.java

clean:
	rm -rf Compiler.class
	rm -rf scanner/Scanner.class
	rm -rf scaner/Scanner.class
	rm -rf parser/CC4Parser.class
	rm -rf ast/Ast.class
	rm -rf semantic/Semantic.class
	rm -rf irt/Irt.class
	rm -rf codegen/Codegen.class
	rm -rf opt/Algebraic.class
	rm -rf opt/ConstantFolding.class
	rm -rf lib/Debug.class
	rm -rf lib/ErrorHandler.class