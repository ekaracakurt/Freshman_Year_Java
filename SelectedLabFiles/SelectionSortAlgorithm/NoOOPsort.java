package pkg2;

import java.util.Scanner;

public class NoOOPsort {

	public static void main(String[] args) {
		int arr_len;
		
		Scanner keybScanner = new Scanner(System.in);
		
		//get array length
		System.out.println("Please enter array lenght: ");
		arr_len = keybScanner.nextInt();
		
		
		//declare and initialise array
		int[] Arr1 = new int[arr_len];
		
		for (int i = 0; i < Arr1.length; i++) {
			System.out.println("Enter next integer for array: ");
			Arr1[i] = keybScanner.nextInt();
		}
		
		
		
		
		//sorting
		
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
		
		
	
		
		
		
		
//		int n = Arr1.length;
//		 
//        // One by one move boundary of unsorted subarray
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//                if (Arr1[j] < Arr1[min_idx])
//                    min_idx = j;
// 
//            // Swap the found minimum element with the first
//            // element
//            int temp = Arr1[min_idx];
//            Arr1[min_idx] = Arr1[i];
//            Arr1[i] = temp;
//        }
//    
//	
		
		//output
		
		for (int i = 0; i < arr_len; i++) {
			System.out.print(Arr1[i] + ", ");
			
		}
		
		
		
		
	}

}
