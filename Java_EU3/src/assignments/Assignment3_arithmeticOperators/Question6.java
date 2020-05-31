package assignments.Assignment3_arithmeticOperators;

public class Question6 {
	
//	Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
//
//	Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.
//
//	       Sample Output
//
//	      Number of milligrams in drink: 500
//	      It would take about 20 drinks for a lethal overdose

	public static void main(String[] args) {
		int numMilligram, numDrinks;
		
		final int lethalOverdose = 10000; // 10gram=10_000mg
		
		numMilligram = 500;
		
		numDrinks = lethalOverdose / numMilligram;
		
		System.out.println("Number of milligrams in drink: " + numMilligram + "\nIt would take about " +  numDrinks + " drinks for a lethal overdose");

	}

}
