package refactorings.wewlc.seams.specialcasetime;

import java.util.Date;

import refactorings.wewlc.seams.extractnew.Chrono;

public class SpecialCaseTime {
	public Object methodToTest() {
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
