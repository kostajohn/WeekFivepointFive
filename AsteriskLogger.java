package weeKFive;

public class AsteriskLogger implements Logger {
 
	public static String log (String log) {
		return ("****************" + "\n" + "***" + log + "***" + "\n" + "****************");
	}
	
	public static String error (String error) {
		return ("****************" + "\n" + "***" + "ERROR" + "***" + "\n" + "**************");
	}




}