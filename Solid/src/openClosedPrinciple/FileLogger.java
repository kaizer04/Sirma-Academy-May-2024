package openClosedPrinciple;

public class FileLogger extends Logger implements ILogger {
	private String fileName;

	public FileLogger(String message, String fileName) {
		super(message);
		this.fileName = fileName;
	}

	@Override
	public void log(Logger logger) {
		// write message to a file
	}
}