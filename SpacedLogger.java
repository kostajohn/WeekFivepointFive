package weeKFive;

public class SpacedLogger implements Logger {

	public static String log (String log){
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < log.length(); i++) {
		if (i > 0) {
			result.append(" ");
		}
		result.append(log.charAt(i));
	} return result.toString();
	
	}
	
	public static String error (String error) {
		StringBuilder result2 = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			if (i > 0) {
				result2.append(" ");
			}
			result2.append(error.charAt(i));
		} return "ERROR:" + result2.toString();
	}



}
	
	