
public class Calculator {
	
	public int add(int a, int b) {
		int temp = 0;
		temp = a + b;
		return temp;
	}
	
	public int subtract(int a, int b) {
		int temp = 0;
		temp = a - b;
		return temp;
	}
	
	public int multiply(int a, int b) {
		int temp = 0;
		temp = a * b;
		return temp;

	}
	
	
	public double power(int a, int b) {
		int temp = 1;
		for (int i = 0; i < b; i++) {
			temp *= a;
		}
		return temp;
	}
	
	public int divide(int a, int b) {
		int temp = 0;
		if (b == 0) {
			return 0;
		}
		else {
			temp = a/b;
			return temp;
		}
		
	}
	
	public double squareRoot(int a) {
		return Math.sqrt(a);
	}
	
	
	
}