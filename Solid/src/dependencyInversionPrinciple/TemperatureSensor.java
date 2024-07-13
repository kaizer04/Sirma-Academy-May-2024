package dependencyInversionPrinciple;

public class TemperatureSensor {
	public Temperature getTemperature() {
		// Return temperature from sensor
		return new Temperature();
	}
}