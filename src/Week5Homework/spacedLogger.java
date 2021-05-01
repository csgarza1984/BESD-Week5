package Week5Homework;

public class spacedLogger implements Logger {

	@Override
	public void log(String log) {
		//print the string with spaces added between each character
		StringBuilder spacedOut = new StringBuilder("");
		
		for (int index = 0; index < log.length(); index++) {
			spacedOut.append(log.charAt(index) + " ");
		}
		
		//Remove space at end
		System.out.println(spacedOut.substring(0, spacedOut.length()-1));
	}

	@Override
	public void error(String error) {
		//print the string after the word "Error" with spaces added between each character
		StringBuilder spacedOutError = new StringBuilder("");
		
		for (int index = 0; index < error.length(); index++) {
			spacedOutError.append(error.charAt(index) + " ");
		}
		
		System.out.println("Error: " + spacedOutError.substring(0, spacedOutError.length()-1));

	}

}
