import java.util.Scanner;

public class pseudoInteractiveVending {
	public static void main(String[] args){
		//Declaration of Data Types
		int amount, originalAmount, pennies, nickels, dimes, quarters;
		String name;
		
		//Obtaining a Name
		System.out.println ("Hello, may I have your name before we begin?");
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.next();
		
		//Introduction
		System.out.println ("How's it going " +name );
		System.out.println ("I'm going to help you find coin combinations!");
		System.out.println ("Pick a number from 1 to 99 cents");
		
		// User Input
		
		amount = keyboard.nextInt();
		originalAmount = amount;
		
		//Quarters
		quarters = (amount/25);
		amount = originalAmount%25;
		System.out.println (quarters+ ": Quarters");
		
		//Dimes
		dimes = (amount/10);
		amount = amount%10;
		System.out.println (dimes+ ": Dimes");
		
		//Nickels
		nickels = (amount/5);
		amount = amount%5;
		System.out.println (nickels+ ": Nickels");
		
		//Pennies
		pennies = amount;
		System.out.println (pennies+ ": Pennies");
		
		//Exit
		System.out.println ("Thank you " +name+ ", Goodbye.");
		
		
		
		
		
		
		

	}

}
