package br.com.proway.senior.learning;

// Lecture 04 - HANDS ON JAVA

/* 
 * The final keyword is a non-access modifier and can be used on
 * Classes (Prevents inheritance), 
 * Variables (constant) and 
 * Methods (Prevents overwrites). 
 */
final public class MyClass {
	
	private static String name = "Will";
	
	// Main runs without instancing MyClass
	public static void main(String[] args) {
		
		/*
		 * PRIMITIVE TYPES
		 *  
		 * byte 2^7
		 * short 2^16
		 * int 2^31
		 * long 2^63
		 * 
		 * float 32bits
		 * double 64bits
		 * 
		 * boolean = true/false
		 * char = 'a'
		 * */
		
		/*
		 * NON-PRIMITIVES
		 * 
		 * Arrays [] = {term1, term2, term3}
		 * String = "text"
		 * 
		 */
		
		/* Primitive types conversion:
		* From a higher type to lower is implicit
		* order : byte > short > int > long > float > double
		* ex:
		* byte lowerVar = 1
		* int higherVar = lowerVar
		* 
		* From a lower type to higher it must be explicit (casting)
		* order: double > float > long > int > short > byte
		* ex:
		* long higherVar = 1
		* int lowerVar = (int) higherVar
		*/
		
		// Declaring variables
		Integer asd = null;
		asd = 42;
		// Casting (changing type of) an int as long
		System.out.println((long)(asd));
		
		// Decisions
		
		//Conditional
		boolean condition = true;
		if (condition) {
			// Instancing the class inside itself so we can use non-static methods.
			var instance = new MyClass();
			instance.printTheBestGuy();
		}
		else {
			System.out.println("wah wah, running else");
		}
		
		
		/* Eclipse Editor tips: 
		* Shift+alt+A -> enter Block Selection Mode
		* Shift+DownArrow -> Column selection in Block Selection Mode
		*/
		var s_y = 0;
		byte s_z = 3;
		byte s_x = 1;
		
		//Switch case
		byte code = s_x;
		switch(code){
			case(0) :
				System.out.println("Code 0");
				break; //Leaves the switch.
			case(1):
				System.out.println("Code 1");
				code = (byte)s_y;
				// no break, it will EXECUTE the next cases.
			case(2):
			case(3):
				System.out.println("Code 2 or 3");
				//break;
			default:
				System.out.println("All the other cases");
		}
		
		// Ternary operator
		// Expression = anything that carries a value
		// Instruction = anything done, not a value, lines that end in ;
		String anotherString = code==0 ? "String is 0" : "String is not 0";
		System.out.println(anotherString);
		
		/* Repetitions
		* Inside loops, break can be used to exit the loop
		* continue can be used to ignore current loop iterarion
		*/
		
		// for loop
		for (int c =0; c < 10; c++) {
			if (c==0) {
				System.out.println("for c=0, using continue to next iteration");
				continue;
			}
			System.out.println("for "+c);
		}
		
		//foreach > Iterables
		char[] zeString = {'a','b','c'};
		for(char letter : zeString) {
			System.out.println("iterable "+letter);
		}
		
		// while - check then run
		while(condition) {
			System.out.println("While");
			condition = false;
		}
		
		//do while - run block then check
		do {
			if (!condition) {
				System.out.println("Using break inside loop");
				break;
			}
			System.out.println("Do while");
		} while (condition);
		
		// Calling a static function
		System.out.println("Static method return: " + staticFunc(null));
		
		System.out.println("Testing recursive with 3: " + recursive(3));
		
	}
	
	// Methods
	// Static methods and functions can be accessed without instancing the class.
	
	/* For some reason Java doesn't have support for "default" values on parameters. To achieve it, set param as null
	* as treat null entries inside the function to asign default values*/
	public static int staticFunc(String in) {
		if(in==null) in = "wah this is a default";
		System.out.println("Static, so static! " + in);
		return 1;
	}
	
	public void printTheBestGuy() {
		// '' for char, "" for strings.
		// since string is a non-primitive
		System.out.println("It's me, "+ name.toUpperCase());
	}
	
	// Polymorphism - Method overload
	public void printTheBestGuy(String otherName) {
		System.out.println("It's me, "+ otherName.toUpperCase());
	}
	
	// Recursion
	static int recursive(int k) {
		if (k>0) return k+recursive(k-1);
		else return 0;
	}
	
	/* Modifiers
	 * 
	 * default
	 * public
	 * private
	 * protected
	 * 
	 * static
	 * final
	 * abstract
	 * synchronized
	 * volatile
	 */
}
