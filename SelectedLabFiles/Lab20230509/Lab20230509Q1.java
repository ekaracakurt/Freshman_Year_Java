import java.util.*;
public class Lab20230509Q1 {

	public static void main(String[] args) {
		
		
		//local variables
		int size_class, temp_sum = 0, stud_fail = 0;
		double sum_avg;
		
		Scanner keybScanner = new Scanner(System.in);
		System.out.println("Enter the class size: ");
		size_class = keybScanner.nextInt();
		if (size_class <= 0)
			size_class = 1;
		//array
		double [] array_a = new double[size_class];
		
		//loop for initialize array 
		for (int i = 0; i < size_class ; i++) {
			
			System.out.println("Enter the grade between 0 and 100 for student " + (i+1) + ":");
			array_a[i] = keybScanner.nextDouble();
			if (array_a[i] < 0 || array_a[i] > 100)
				do {
					System.out.println("Grade is out of range, please enter again: ");
					array_a[i] = keybScanner.nextDouble();
				} while (array_a[i] < 0 || array_a[i] > 100);
			
			
		}
		//sum loop
		for (int j = 0; j < array_a.length; j++) {
			temp_sum += array_a[j];
		}
		
		//sum
		sum_avg = (double)temp_sum / size_class;
		
		
		//loop for fail or pass
		
		for (int k = 0; k < array_a.length; k++) {
			
			if (array_a[k] < 55 ) {
				stud_fail++;
			}
			
				
			
			}
			
		
		//outputs
		
		System.out.println("Average of the grades is: " + sum_avg);
		
		
		System.out.println("Number of failed students are: " + stud_fail);
		
		
		
		keybScanner.close();
		
		
			
		}
		
		
		
		
	}
	
	
	

