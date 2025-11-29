/**
 * Displays and counts all numbers from 1 to 100 that are multiples of 2 or 3.
 */
public class Ex04Multiple2n3 {

	public static void main(String args[]) {
		int	mul2 = 0, mul3 = 0, total = 0;													// To count the amount of multiples.

		System.out.println("Welcome to Multiple2n3.\nNo input is needed.\n");				// Welcome message

		System.out.print("The following numbers are multiples of 2 or/and 3:\n\t");			// Prints message for multiples
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0 || (i % 3) == 0) {												// Calculates the module to determinate if multiple
				if ((i % 2) == 0) 															// Counts if multiple of 2
					mul2++;
				if ((i % 3) == 0)															// Counts if multiple of 3
					mul3++;
				total++;
				System.out.print(i + " ");													// Prints the number
			}
		}
		System.out.println("\n\nThe total amount of numbers multiples of 2 are " + mul2);	// Prints total amount value of multiples of 2
		System.out.println("The total amount of numbers multiples of 3 are " + mul3);		// Prints total amount value of multiples of 3
		System.out.println("\nThe total amount of numbers printed are " + total);			// Prints total amount value of printed numbers
	}

}
