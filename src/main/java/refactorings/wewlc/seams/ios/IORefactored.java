package refactorings.wewlc.seams.ios;

import java.util.Date;

import refactorings.wewlc.seams.extractnew.Chrono;

public class IORefactored {
	final Console console;
	
	public IORefactored() {
		this(new Console());
	}
	
	public IORefactored(Console console) {
		this.console = console;
	}
	
	public Object methodToTest() {
		Date date = Chrono.today();
		// ...
		if (date.before(new Date(2022, 01, 01))) {
			// testable avec une autre implem de console ...
			console.println("Avant"); 
		} else {
			console.println("Après"); 
		}
		
		return null;
	}

}
