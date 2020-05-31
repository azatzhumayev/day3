package assignments.Assignment3_arithmeticOperators;

public class Question4 {
//	Declare 2 variables (Num1, Num2)
//
//	Swap values between Num1 and Num2
//
//	Display new values of Num1 and Num2
//
//	      Sample output:
//
//	      n1=10
//	      n2=20
//
//	      ----------
//
//	      n1=20
//	      n2=10
	
	public static void main(String[] args) {

		int num1 = 10,
				num2 = 20,
				    swap = num1;
		
		System.out.println("n1 = " + num1 + "\nn2 = " + num2 + "\n"+"\n-------" + "\n");
		
		num1 = num2;
		num2 = swap;
		
		System.out.println("n1 = " + num1 + "\nn2 = " + num2);
		
	}

}
