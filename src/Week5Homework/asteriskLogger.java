package Week5Homework;

public class asteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// Print the string with three asterisks before and after it
		System.out.println("***" + log + "***");

	}

	@Override
	public void error(String error) {
		// Print the string after the word ERROR: and surround it in a box of asterisks
		
		String errorMsg = "***Error: " + error + "***";
		
		//create line of asterisks the length of the error message with asterisk on either side
		StringBuilder starLine = new StringBuilder ("");
		
		for (int index = 0; index < errorMsg.length(); index++) {
			starLine.append("*");
		}
		
		System.out.println(starLine);
		System.out.println(errorMsg);
		System.out.println(starLine);
		
	}

}
