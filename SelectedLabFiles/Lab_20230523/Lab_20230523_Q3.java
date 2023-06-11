import java.util.*;

public class Lab_20230523_Q3 {

	public static void main(String[] args) {
		
		Scanner keybScanner = new Scanner(System.in);
		
		//array declare and initialize
		
				int[] array1 = new int[7];
				System.out.println("Enter 7 integers:");
				for (int i = 0; i < array1.length; i++) {
					array1[i] = keybScanner.nextInt();
				}
		/*sorting and finding median value, as our array length is 7, our median value will be at
		third index, as it is equal to 4th value.
		*/
				
				Arrays.sort(array1);
				System.out.println("Median value: " + array1[3]);
			
			keybScanner.close();
	}

}
