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
		
		Integer asd = null;
		asd = 42;
		// if
		if (asd!=null) {
			// Casting an int as long
			System.out.println((long)(asd));
		}
		
		/* Shift+alt+A -> enter Block Selection Mode
		* Shift+DownArrow -> Column selection in Block Selection Mode
		*/
		var s_y = 2;
		var s_z = 3;
		var s_x = 1;
		
		//foreach > Iterables
		char[] zeString = {'a','b','c'};
		for(char letter : zeString) {
			System.out.println(letter);
		}
		
		// Static methods and functions can be accessed without instancing the class.
		printTheBestGuy();
	}
	
	public static void printTheBestGuy() {
		// '' for char, "" for strings.
		
		// since string is a non-primitive
		System.out.println("It's me, "+ name.toUpperCase());
	}
	
}
