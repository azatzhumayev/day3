package assignments.Assignment3_arithmeticOperators;

public class Question2 {
	  /*  Write a program - > Declare variables for your name and birth year, and the program will display:

          " Hello, Ozzy! Based on your input, your age is 15 :) "
      */
	public static void main(String[] args) {
		
		
		String name; 
		final int birthYear; 
		int currenYear, age;
		
		name        = "Ozzy";
		birthYear   = 2005;
		currenYear  = 2020;
		age         = currenYear - birthYear;
		
		System.out.println("\"Hello," + name + "! Based on your input, your age is " + age + " :) \" ");

	}

}
