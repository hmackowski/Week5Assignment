package Week5Assignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpacedLogger sLogger = new SpacedLogger();
		AsteriskLogger aLogger = new AsteriskLogger();		
		
		aLogger.log("Hello");
		System.out.println("\n"); //new line
		aLogger.error("Hello");
		
		System.out.println("\n"); // new line
		sLogger.log("Haskell");
		System.out.println("\n"); // new line
		sLogger.error("Haskell");

	}

}
