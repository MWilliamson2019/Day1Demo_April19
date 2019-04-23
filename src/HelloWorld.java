import java.util.Scanner;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//this is an example of a single line comment
		
		/*
		 * This is an example of a block comment
		 * usually used for multiple line of comment
		 * 
		 * --also useful for generating our own Java Documentation
		 */
		
		System.out.print("Hello");//print does not go to a new line, so we added \n to add a new line ("Hello \n");
		System.out.println("World!");
		
		//this is a Scanner object -- let's us take in user input		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		int num = scan.nextInt();
		System.out.println(num);
		
		//garbage line -- this cleans out the scanner to take in different types of input
		//this is necessary when going from numberic to scan.nextLine(), if you are going from a number to a users name (first and last)
		scan.nextLine();
		
		//System.out.println("Please enter your first and last name:");
		//String fullName = scan.next();
		//System.out.println(fullName);
		
		//this is a constant ad cannot be changed
		final String TEST = "Grand Circus";
		//TEST = "Grand Circus Diner"; // this can't be done
		
		//primitive data types
		byte b = 127;
		short s = 128;
		int i = 1;
		long l = 6788567878L; // L needs to be specified if the number assigned is smaller than the MAX Size of an int
		float f = (float)56.7f; //(float) is a form of casting you can use upper or lower case f
		double d = 56.7; //Can be assigned without any addition
		char c = '@'; // chars are declared with single quotes
		boolean bool = true;
		
		System.out.println(9 % 5);// modulus returns the remainder
		System.out.println("s = " + s);		
		System.out.println("s =" + ++s); // post increment	
		s--; //decrement 
		
		++s; // pre-increment
		
		String words = "this is a sentence!";
		words += "and add some words!";
		System.out.println(words);
		
		
		//implicit casting example
		//when going from a less precise type to a more precise type
		int age = 21;
		double myAge = age;
		System.out.println(myAge);
		
		//explicit casting
		//when going from a more precise type to a less recise type
		double total = 258.54;
		int newTotal = (int)total; // truncating the decimal places
		System.out.println(newTotal);
		
		
		//String TEST = "Grand Circus Diner"; //this can't be done
		scan.close(); //this should be the end of your scanner use
	}
	
	

}
