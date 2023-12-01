package refactorings.wewlc.seams.extractmethod;

public class ExtractMethod {
	
	public Object complicatedMethod(Object o) {
		
		wishYouWereNotHere(o);
		
		/**
		 * the code you wan't to test
		 */
		if (o == null) {
			System.err.println("WRONG");
		}
		
		return o;
	}

	protected void wishYouWereNotHere(Object o) {
		/**
		 * very complicated code that you already test 
		 * or wish was not here for your test
		 */
		System.err.println(o);
		System.err.println(o);
		System.err.println(o);
		System.err.println(o);
	}
}
