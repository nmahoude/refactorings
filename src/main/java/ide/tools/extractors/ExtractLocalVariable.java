package ide.tools.extractors;

public class ExtractLocalVariable {

	public void myMethod() {
		
		String value ="toto";

		/* extract a variable for value.charAt(0) */
		if (value.charAt(0) == 't') {
			System.out.println("should be toto");
		} else if (value.charAt(1) == 'o') {
			System.out.println("can't be toto");
		}
		
	}
}
