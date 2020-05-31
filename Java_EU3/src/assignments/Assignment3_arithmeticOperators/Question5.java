package assignments.Assignment3_arithmeticOperators;

public class Question5 {
	
//	Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
//
//	-Declare int variables inputSeconds, hours, minutes, seconds
//	-Initialize the inputSeconds
//
//	-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
//	-Assign values to the hours, minutes, seconds variables
//	-Display the result
//
//	       Sample Output:
//
//	       inputSecond is 3695
//
//	      1 hours, 1 minutes, and 35 seconds

	public static void main(String[] args) {
		
		int inputSecond, hours, minutes, second;
		
		inputSecond = 3695;
		
		hours = inputSecond / 3600; //hours=60minutes; minutes=60 secons => hours=60*60 => 3600
		minutes = inputSecond % 3600 / 60;
		second = inputSecond % 3600 % 60 % 60;
		
		System.out.println(inputSecond + " seconds = " + hours + " hours, " + minutes + " minutes, and " + second + " seconds.");
		
		
		
	
		

	}

}
