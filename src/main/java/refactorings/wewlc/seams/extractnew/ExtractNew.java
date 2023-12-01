package refactorings.wewlc.seams.extractnew;

import java.util.Date;

@SuppressWarnings("deprecation")
public class ExtractNew {

	public Object methodToTest() {
		// ...
		Date date = today();
		// ...
		if (date.before(new Date(2022, 01, 01))) {
			System.err.println("Avant");
		} else {
			System.err.println("Après");
		}
		
		return null;
	}

	protected Date today() {
		Date date = new Date();
		return date;
	}
}
