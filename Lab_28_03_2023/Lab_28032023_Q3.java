import java.util.Scanner;
public class Lab_28032023_Q3 {

	public static void main(String[] args) {
		
		//variables
		
		int tl_5, tl_10, tl_20, tl_total, total_as_20, total_as_5;
		
		//inputs
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Number of 5TL:");
		tl_5 = keyboard.nextInt();
		System.out.println("Number of 10TL:");
		tl_10 = keyboard.nextInt();
		System.out.println("Number of 20TL:");
		tl_20 = keyboard.nextInt();
		
		//calculations
		
		tl_total = (tl_5*5) + (tl_10*10) + (tl_20*20);
		total_as_20 = tl_total / 20 ;
		total_as_5 = (tl_total % 20) / 5 ;
		
		//outputs
		
		System.out.println("Total money: " + tl_total);
		System.out.println("Total money equals to " + total_as_20 + " 20TLs and " + total_as_5 + " 5TLs.");
		// TODO Auto-generated method stub

	}

}
