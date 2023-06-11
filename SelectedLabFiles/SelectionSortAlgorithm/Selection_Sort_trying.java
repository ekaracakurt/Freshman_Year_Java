package pkg2;

import java.util.Scanner;

public class Selection_Sort_trying {
	
	static Scanner keybScanner = new Scanner(System.in);
	
	public static int arr_len ;
	public int[] Arr1 = new int[Selection_Sort_trying.getArrayLenght()];
	
	public static int getArrayLenght() {
		System.out.println("Please enter array lenght: ");
		arr_len = keybScanner.nextInt();
		return arr_len;
	}
	
	public int[] buildArray() {
		
		for (int i = 0; i < Arr1.length; i++) {
			System.out.println("Enter next integer for array: ");
			Arr1[i] = keybScanner.nextInt();
		}
		return Arr1;
	}
	
	public void outputArray() {
		for (int i = 0; i < arr_len; i++) {
			System.out.print(Arr1[i] + ", ");
		}
		
		
	}
	
	public void sortSelection() {
		int n = Arr1.length;
		
		for (int i = 0; i < n-1; i++) {
			int indexmin = i;
			
			for (int j = i+1; j < n; j++) {
				
				if (Arr1[j] < Arr1[indexmin]) {
					indexmin = j;
				}
			}
				int temp = Arr1[indexmin];
				Arr1[indexmin] = Arr1[i];
				Arr1[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		Selection_Sort_trying sortArray = new Selection_Sort_trying();
		//Selection_Sort_trying.getArrayLenght();
		sortArray.buildArray();
		sortArray.sortSelection();
		sortArray.outputArray();
		
	}
	
}
