import java.util.*;
public class Lab_20230509Q2 {
	public static void main(String[] args) {
		
		//local variables
		int row_numb;
		
		Scanner keybScanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		row_numb = keybScanner.nextInt();
		
		for (int i = row_numb; i > 0; i--) {
			
			
			for (int k = 0; k < row_numb - i; k++) {
				System.out.print(" ");
				
			}
			
			
			
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
				
			}
			
			System.out.print("\n");
			
			
		}
		
		keybScanner.close();
		}
		
		
		
	}

