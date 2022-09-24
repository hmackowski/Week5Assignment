package Week5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String logger) {
		// TODO Auto-generated method stub
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < logger.length(); i++) {
			
			result.append(logger.charAt(i) + " ");
		}
		System.out.println(result.toString());

	}
	
	
	
	
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			result.append(error.charAt(i) + " ");
		}
		System.out.println("ERROR: " + result.toString());
	}

}
