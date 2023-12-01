package refactorings.wewlc.seams.staticcalls;

import java.util.Date;

public class StaticCalls {
	private ChronoRef chronoRef;

	public StaticCalls() {
		chronoRef = new ChronoRef();
	}

	public StaticCalls(ChronoRef chronoRef) {
		this.chronoRef = chronoRef;
	}
	
	
	public Object methodToTest() {
		Date date = chronoRef.today();
		// ...
		if (date.before(new Date(2022, 01, 01))) {
			System.err.println("Avant");
		} else {
			System.err.println("Après");
		}
		
		return null;
	}
}
