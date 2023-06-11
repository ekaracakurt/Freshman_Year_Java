import java.util.*;
public class Lab_20230523_Q1 {
	public static void main(String[] args) {
		
		Scanner keybScanner = new Scanner(System.in);
		
		//array declare and initialize
		
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println((i+1)+ ". number:");
			array1[i] = keybScanner.nextInt();
		}
		
		//extract the even numbers from array
		int[] array_even = new int[10];
		for (int i = 0; i < array1.length; i++) {
			if ((array1[i] % 2) == 0)
				array_even[i] = array1[i];
		}
		
		//sorting and output
		Arrays.sort(array_even);
		System.out.println("The first largest even number is: " + array_even[array_even.length - 1]);
		System.out.println("The second largest even number is: " + array_even[array_even.length - 2]);
		
		keybScanner.close();
	}
}
