import java.util.Scanner;
public class Temperature_Converter {

	public static void main(String[] args) {
		
		
		// değişkenler
		double celcius_inp,fahrenheit_inp,kelvin_inp,celc_fahr,fahr_celc,celc_kel,kel_celc,fahr_kel,kel_fahr;
		
		//input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the celcius value you want to convert:");
		celcius_inp = keyboard.nextDouble();
		System.out.println("Please enter the fahrenheit value you want to convert:");
		fahrenheit_inp = keyboard.nextDouble();
		System.out.println("Please enter the kelvin value you want to convert:");
		kelvin_inp = keyboard.nextDouble();
		
		// celcius dönüşümler
		
 		celc_fahr = (celcius_inp*1.8) + 32;
		celc_kel = celcius_inp + 273.15;
		
		// fahrenheit dönüşümler
		
		fahr_celc = (fahrenheit_inp - 32) / 1.8 ;
		fahr_kel = fahr_celc + 273.15 ;
		
		// kelvin dönüşümler
		
		kel_celc = kelvin_inp -273.15;
		kel_fahr = (kel_celc * 1.8) + 32;
		
		//çıktılar
		
		System.out.println(celcius_inp + "°C is approximately " + Math.round(celc_fahr) + "°F and " +
				Math.round(celc_kel) + "K when you convert it.");
		
		System.out.println(fahrenheit_inp + "°F is approximately " + Math.round(fahr_celc) + "°C and " +
				Math.round(fahr_kel) + "K when you convert it.");
		
		System.out.println(kelvin_inp + "K is approximately " + Math.round(kel_celc) + "°C and " +
				Math.round(kel_fahr) + "°F when you convert it.");
		
		keyboard.close();
	}

}
