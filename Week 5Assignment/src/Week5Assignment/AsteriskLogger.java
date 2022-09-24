package Week5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String logger) {
		// TODO Auto-generated method stub
		System.out.println("***" + logger + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("******************\n***Error: " + error + "***\n******************");
	}

}
