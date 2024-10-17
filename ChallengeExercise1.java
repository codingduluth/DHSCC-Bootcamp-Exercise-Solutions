import java.util.*; //Dont forget to import this. This is where you will be able to get the scanner from. Without this, you will encounter an error relating to the scanner.

public class ChallengeExercise1 { 
  
	public static void main(String[] args) { 
    Scanner console = new Scanner(System.in);
		// Set prices
    double cheeseburgerCost = 4.99; 
    double friesCost = 1.99;
    double saladCost = 3.99;
    double drinkCost = 1.99;

    //Declare variables for how many items user will order: 
    //It is possible to declare many variables at once by using commas in between each variable.
    int cheeseburgerCount, friesCount, saladCount, drinkCount;

    //Declare total variables
    double subtotal; 
    double total;


    //Ask for how many items the user wants: 
    System.out.println("How many cheeseburgers would you like?");
    cheeseburgerCount = console.nextInt();

    System.out.println("How many fries would you like?");
    friesCount = console.nextInt();

    System.out.println("How many salads would you like?");
    saladCount = console.nextInt();

    System.out.println("How many drinks would you like?");
    drinkCount = console.nextInt();
    
    //Assign the subtotal to its variable: 
    subtotal = (cheeseburgerCost * cheeseburgerCount) + (friesCost * friesCount) + (saladCost * saladCount) + (drinkCost * drinkCount);

    // Add the additonal 7% tax to the subtotal and assing it to the total variable
    total = subtotal * 1.07;

    //Print out totals
    System.out.print("Your subtotal is: $");
    System.out.println(subtotal);

    System.out.print("Your total is: $");
    System.out.println(total);
		
	}	
}
