//Name Kai Marshall
//Class Programming 1
//GitHub k.marshal
//Project Program 1


// Import Required Code (import code for keyboard)
		import java.util.Scanner;
		public class  program2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberone;
		int numbertwo;
		int numberthree;

		
		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your first number ?");
		numberone = keyboard.nextInt();
		System.out.println("what is your second number ?");
		numbertwo = keyboard.nextInt();
		System.out.println("What is your third number ?");
		numberthree = keyboard.nextInt()
;		 
		//Declare variables 
		int choice;
		
		System.out.println("Main Menu");
		System.out.println("========/n");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
	    System.out.println("Exit");
	    
	    
			choice = keyboard.nextInt();
			  
			int operation = 0;
			

			switch (choice)
			{
			case 1:
				operation= numberone + numbertwo;
			     System.out.println("Sum of the integers = " + operation);				  
			     break;
			      
			case 2:
				operation= numberone - numbertwo;
			     System.out.println("Substraction of the integers = " + operation);				  
			     break;
			case 3:
				operation = numberone * numbertwo;
			     System.out.println("Multiplication of the integers = " + operation);	
			    break;
			    
			case 4:
				operation = numberone / numbertwo;
			     System.out.println("Divition of the integers = " + operation);
			    break;
			    
			case 5:
				System.out.println("Thanks!");
			    break;
			    
			default:
				System.out.println(" You made an invalid choice");
			
					}
			
			
			if(operation > numberthree)
			    System.out.println(  operation + " is greater than " + numberthree);
			
			else
				if (operation < numberthree)
					System.out.println(  operation + " is less than " + numberthree);
				else
					System.out.println(  operation + " is equal to " + numberthree);
}

}
	    