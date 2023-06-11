import java.util.Scanner;

public class Lab_20230523_Q2 {

	public static void main(String[] args) {
		
		Scanner keybScanner = new Scanner(System.in);
		
		//array declare and initialize
		
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println((i+1)+ ". number:");
			array1[i] = keybScanner.nextInt();
		}

		//reading the array and determining if every number is two times bigger than before
		
		String temp0 = "";
		for (int i = 0; i < array1.length-1; i++) {
			if ((array1[i] *2 ) == array1[i+1]) {
				temp0 = " is ";
			}
			else {
				temp0 = " is not ";
			}
		}
		
		//building the output sentence and output
		
		System.out.println("Each number" + temp0 + "two times bigger than the previous number.");
		
		keybScanner.close();
	}

}
