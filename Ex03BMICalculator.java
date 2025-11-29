import	java.util.Scanner;

/**
 * Receives kg and m input. Displays your BMI.
 */
public class Ex03BMICalculator {

	public static void main(String args[]) {
		// MEASURES CONSTANTS
		final double	MAX_WEIGHT = 300;											// Uses constants so if we want to change values, is easier
		final double	MIN_WEIGHT = 30;
		final double	MAX_HEIGHT = 2;
		final double	MIN_HEIGHT = 1.3;
		
		boolean		valWeight, valHeight;											// Declare validators
		Scanner		sc = new Scanner(System.in);									// To receive input

		System.out.println("Welcome to BMICalculator");								// Welcome message

		System.out.println("Set your weight and your height in kg and m."			// Prints instructions
				+ " Decimals are allowed with ','\n"
				+ "Weight must be between 30kg(min) & 300kg(max) and "
				+ "height must be between 1,30(min) & 2(max).");
		
		System.out.print("Insert your weight: ");
		double	weight = sc.nextDouble();											// Stores first value for weight
		System.out.print("Insert your height: ");
		double	height = sc.nextDouble();											// Stores first value for height

				
		do {																		// Loops until both measures are correct
			valWeight = weight >= MIN_WEIGHT && weight <= MAX_WEIGHT;				// Sets validators
			valHeight = height >= MIN_HEIGHT && height <= MAX_HEIGHT;
			
			if (!valWeight) {														// Checks weight validator
				System.err.println("Error:\tYour weight is " + weight 				// Error message
						+ ". Weight must be set between 30kg(min) & 300kg(max).");
				System.out.print("Please give a correct weight input: ");			// Asks for weight input
				weight = sc.nextDouble();											// Sets new value
			}
			if (!valHeight) {														// Checks height validator
				System.err.println("Error:\tYour height is " + height 				// Error message
						+ ". Height must be set between 1,30m(min) & 2m(max).");
				System.out.print("Please give a correct height input: ");			// Asks for height input
				height = sc.nextDouble();											// Sets new value
			}
		} while (!valWeight || !valHeight);											// Condition for keep on loop
	
		sc.close();																	// Closes scanner
		
		double	bmi = weight / (height * height);									// Declares bmi and sets a value

		if (bmi < 18.5)																// Prints a message with the bmi value and a valoration
			System.out.printf("BMI: %.2f -> Underweight.", bmi);					// based on the chart given
		else if (bmi < 25)
			System.out.printf("BMI: %.2f -> Normal weight.", bmi);
		else if (bmi < 30)
			System.out.printf("BMI: %.2f -> Overweight.", bmi);
		else
			System.out.printf("BMI: %.2f -> Obesity.", bmi);
	}
}

//	Note: Due my language configuration, decimals must be write with ',' and not with '.'
//		If program didn't work as expected, try changing ',' with '.'
