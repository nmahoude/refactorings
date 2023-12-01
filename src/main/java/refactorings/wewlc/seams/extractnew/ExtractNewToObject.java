package refactorings.wewlc.seams.extractnew;

import java.util.Date;

@SuppressWarnings("deprecation")
public class ExtractNewToObject {

	public Object methodToTest() {
		// ...
		Date date = Chrono.today();
		// ...
		if (date.before(new Date(2022, 01, 01))) {
			System.err.println("Avant");
		} else {
			System.err.println("Après");
		}
		
		return null;
	}

}
