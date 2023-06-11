import java.util.Scanner;
public class maintwo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a temperature in degrees Celsius: ");
double degreesCelsius = scanner.nextDouble();
Temperature temperature = new Temperature(degreesCelsius);
System.out.println("The temperature in degrees Fahrenheit is " +
temperature.getFahrenheit());
temperature.printFreezingMessage();
}
}