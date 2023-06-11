import java.util.Scanner;
public class main {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int a = scanner.nextInt();
System.out.print("Enter the second integer: ");
int b = scanner.nextInt();
Calculator calc = new Calculator();
System.out.println(a + " + " + b + " = " + calc.add(a, b));
System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
System.out.println(a + " / " + b + " = " + calc.divide(a, b));
System.out.println("sqrt(" + a + ") = " + calc.squareRoot(a));
System.out.println(a + "^" + b + " = " + calc.power(a, b));
}
}