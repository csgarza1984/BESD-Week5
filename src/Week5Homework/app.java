package Week5Homework;

public class app {

	public static void main(String[] args) {
		
		Logger starLogger = new asteriskLogger();
		Logger spacesLogger = new spacedLogger();
		
		starLogger.log("StarLog");
		starLogger.error("Oops!");

		spacesLogger.log("Spaced");
		spacesLogger.error("Incorrect");
		
	}

}
