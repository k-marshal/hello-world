//Name Kai Marshall
//Class Programming 1
//GitHub k.marshal
//Project Program 1


// Import Required Code (import code for keyboard)
		import java.util.Scanner;
		public class Variable {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Declare Variables
		int age; 
		int favnumber;
		String name= "Kai";

		// Start keyboard scanner 
		Scanner keyboard = new Scanner (System.in);

		// Collect input from user
		System.out.print("What is your name? ");
		name = keyboard.next();

		System.out.print("What is your age? ");
		age = keyboard.nextInt(); 

		System.out.print("What is your favorite number? ");
		favnumber = keyboard.nextInt(); 

		// Output User Information
		System.out.print("\n" + name + " is " + age + " years," + favnumber + " is his favorite number " );
		}

	}


