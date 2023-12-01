package refactorings.wewlc.seams.ios;

import java.util.Date;

import refactorings.wewlc.seams.extractnew.Chrono;

public class IO {
	
	public Object methodToTest() {
		Date date = Chrono.today();
		// ...
		if (date.before(new Date(2022, 01, 01))) {
			System.err.println("Avant"); // oups comment tester ça ? 
		} else {
			System.err.println("Après"); // oups comment tester ça ?
		}
		
		return null;
	}

}
