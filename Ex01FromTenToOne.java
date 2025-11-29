/*
 * Displays numbers from 10 to 1.
 */
public class Ex01FromTenToOne {

	public static void main(String args[]) {
		int	i = 10;																// We are going to use this integer as iterator.
		
		System.out.println("Welcome to FromTenToOne.\nNo input is needed.\n");	// Prints welcome message
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}
	}
}
