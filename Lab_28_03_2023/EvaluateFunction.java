import java.util.Scanner;
public class EvaluateFunction {

	public static void main(String[] args) {
		
		//variables
		
		int x, y, z;
		double func_f, func_g;
		
		//inputs
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter integer x:");
		x = keyboard.nextInt();
		System.out.println("Enter integer y:");
		y = keyboard.nextInt();
		System.out.println("Enter integer z:");
		z = keyboard.nextInt();
		
		//functions
		
		func_f = ((double) (2*x - 2*y) / (x + y)) + (double) (7*x*y) / 2; 
		func_g = ((double) ((x*x) - (y*y)) / (x + z)) + ((double) (x*x)+(z*z)) / (y - z);
		
		//outputs
		
		System.out.println("f(" + x + "," + y + ") = " + Math.round(func_f));
		System.out.println("g(" + x + "," + y + "," + z + ") = " + Math.round(func_g));
		
		
		// TODO Auto-generated method stub

	}

}
