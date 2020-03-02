package weeKFive;

public class App {


public static void main (String [] args) {
	
	System.out.println(SpacedLogger.log("Michelle"));
	System.out.println(SpacedLogger.error("john"));
	
	System.out.println(AsteriskLogger.log("This is wrong!"));
	System.out.println(AsteriskLogger.error("This is an error!"));
}

}