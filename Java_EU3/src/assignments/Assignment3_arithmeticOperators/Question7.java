package assignments.Assignment3_arithmeticOperators;

public class Question7 {

//	Write a program that determines the change to be dispensed from a vending machine. 
//	An item in the machine can cost between 25 cents and 
//	1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
//	and the machine accepts only a single dollar bill to pay for the item.
//
//    Sample output
//
//    Price in cents : 95
//
//    Your change is 0 quarters, 0 dimes, and 1 nickles
	
	public static void main(String[] args) {
		
		char unit = 162;
		int change, quarters, dimes, nickles,
		
		dollar = 100, // 1$=100cents
		price = 25;
		change = dollar - price;
		quarters = change / 25;
		dimes = change % 25 / 10;
		nickles = change % 25%10%5;
		
		System.out.println("Price in cents : "+unit+price+"\nYour change is "+quarters+" quartes, "+dimes+" dimes, and "+nickles+" nickles.");

	}

}
