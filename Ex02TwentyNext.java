import	java.util.Scanner;

/**
 * Receives an integer as an input and return the consecutive next 20 numbers.
 */
public class Ex02TwentyNext {

	public static void main(String args[]) {
		Scanner	sc = new Scanner(System.in);								// To receive input.
		int		i;															// Var where the input is stored.

		System.out.println("Welcome to TwentyNext.\nChoose one number "
				+ "and I will return the twenty next numbers!");			// Welcome message and info about the program.
		
		do {
			System.out.print("Please give me a positvie number please: ");	// Input msg.
			i = sc.nextInt();												// Stores the input
		} while (i <= 0);													// If the input is not positive, won't stop the loop.
		
		sc.close();															// Close scanner.
		
		for (int j = i + 1; (j - i) <= 20; ++j) {							// Prints the 20 next numbers with this loop.
			System.out.print(j + " ");
		}
	}
}
