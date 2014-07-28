make: Compiler.class scanner\Scanner.class parser\CC4Parser.class ast\Ast.class semantic\Semantic.class irt\Irt.class codegen\Codegen.class opt\Algebraic.class opt\ConstantFolding.class lib\Debug.class lib\ErrorHandler.class 
	
Compiler.class: Compiler.java
	javac Compiler.java
	
Scanner.class: scanner\Scanner.java
	javac scanner\Scanner.java

CC4Parser.class: parser\CC4Parser.java	
    javac parser\CC4Parser.java

Ast.class: ast\Ast.java
    javac ast\Ast.java

Semantic.class: semantic\Semantic.java
    javac semantic\Semantic.java

Irt.class: irt\Irt.java
    javac irt\Irt.java

Codegen.class: codegen\Codegen.java
    javac codegen\Codegen.java

Algebraic.class: opt\Algebraic.java
    javac opt\Algebraic.java
              
Algebraic.class: opt\ConstantFolding.java
	javac opt\ConstantFolding.java

Debug.class: lib\Debug.java
    javac lib\Debug.java

ErrorHandler.class: lib\ErrorHandler.java
	javac lib\ErrorHandler.java

clean:
	rm -rf Compiler.class
	rm -rf scanner\Scanner.class
	rm -rf scaner\Scanner.class
	rm -rf parser\CC4Parser.class
	rm -rf ast\Ast.class
	rm -rf semantic\Semantic.class
	rm -rf irt\Irt.class
	rm -rf codegen\Codegen.class
	rm -rf opt\Algebraic.class
	rm -rf opt\ConstantFolding.class
	rm -rf lib\Debug.class
	rm -rf lib\ErrorHandler.class