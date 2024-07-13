package openClosedPrinciple;

public class ConsoleLogger extends Logger implements ILogger {
	public ConsoleLogger(String message) {
		super(message);
	}

	@Override
	public void log(Logger logger) {
		System.out.println(logger.toString());
	}
}