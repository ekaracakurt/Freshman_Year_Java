
public class Temperature {

	public double degreesCelsius;
	
	public Temperature(double degreesCelsius) {
		
		this.degreesCelsius = degreesCelsius;
		
	}
	
	public double getFahrenheit() {
		
		double fahrenheitAsCelsius = degreesCelsius * 9 / 5 + 32;
		return fahrenheitAsCelsius;
	}
	
	public void printFreezingMessage() {
		
		if (degreesCelsius <= 0)
			System.out.println("The temperature is at or below freezing.");
		else {
			System.out.println("The temperature is above freezing.");
		}
		
	}
}
