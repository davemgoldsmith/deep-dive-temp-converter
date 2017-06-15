package edu.cnm.deepdive.temperature;

public class C2F {
	
	public static final String USAGE_MESSAGE = "Usage: java %s tempCelsisus"
			+ "where tempCelsius is temperature in Celsius degrees";
	public static final String OUTPUT_MESSAGE = "%8.3f\u00B0 Celsius = %8.3f\u00B0 Fahrenheight";
	
	public static void main(String[] args) {
		
		if (args.length > 0 ) {
			
			try{
				double c = Double.parseDouble(args[0]);
				double f = 32 + c * 9 / 5;
				System.out.printf(OUTPUT_MESSAGE,  c, f);
			} // end try
			catch (NumberFormatException ex) {
				ex.printStackTrace();
				System.out.printf(USAGE_MESSAGE, C2F.class.getName());
			} //end catch
			} // end if
			else {
				System.out.printf(USAGE_MESSAGE, C2F.class.getName());
			} // end else
		

	} // end main method

} // end C2F class
