package dependencyInversionPrinciple;

public class WeatherReporter {
	private Weather weather;

	public String report() {
		return "Current temperature: " + weather.getTemperature();
	}
}