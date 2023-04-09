import java.util.Scanner;
public class Lab_28032023_Q1 {

	public static void main(String[] args) {
		
		//variable declarations 
		final double inch_to_cm = 2.54;
		double inch_input, converted_inch_cm;
		
		//input
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter distance in inches:");
		inch_input = keyboard.nextDouble();
		
		//conversion
		
		converted_inch_cm = inch_to_cm * inch_input;
		
		//output
		
		System.out.println(inch_input + " inches is equal to " + Math.round(converted_inch_cm) + " cm.");
		
		
		
		// TODO Auto-generated method stub

	}

}
