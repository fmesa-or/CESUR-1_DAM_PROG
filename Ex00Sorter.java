import	java.util.Scanner;

/**
 * Sorts 3 numbers ascending or descending depending on input given.
 */
public class Ex00Sorter {

	public static void main(String args[]) {
		Scanner	sc = new Scanner(System.in);							// To receive input.
		int[]	numbers = new int[3];								// Integer array with 3 positions.
		int		tmp;

		System.out.println("Welcome to Sorter.\nFill the info asked:");	// Print welcome message and give instructions to user. 

		for (int i = 0; i < 3; i++) {
			System.out.printf("\tNumber %d: ", i + 1);					// Prints which number are we asking for each round.
			numbers[i] = sc.nextInt();									// Receives and store each number inside an array.
		}
		sc.nextLine();													// Clean the buffer input.
		
		String	flag = "x";												// Set flag to a wrong option.

		while(!flag.equals("A") && !flag.equals("D")) {					// Loop while there is no good input.
			System.out.print("Write 'A' to sort ascending or 'D' "
				+ "to sort descending.\n\tSort input: ");				// Prints message with options.
			flag = sc.nextLine().toUpperCase();							// Reads new input for flag. No matter if input is in lower case.
			if (!flag.equals("A") && !flag.equals("D"))					// If input still wrong, prints message.
				System.out.println("Wrong sort option. Try again!");
		}

		do {															// Sorts the number array from smaller to bigger.
			if (numbers[0] > numbers[1]) {
				tmp = numbers[0];
				numbers[0] = numbers[1];
				numbers[1] = tmp;
			}
			if (numbers[1] > numbers[2]) {
				tmp = numbers[1];
				numbers[1] = numbers[2];
				numbers[2] = tmp;
			}
		} while (numbers[0] > numbers[1] || numbers[1] > numbers[2]);
		
		if (flag.equals("A"))
			System.out.printf("Ascending sort: %d %d %d", 
					numbers[0], numbers[1], numbers[2]);
		else
			System.out.printf("Descending sort: %d %d %d", 
					numbers[2], numbers[1], numbers[0]);
		
		sc.close();														// Closes the scanner.
	}	
}
