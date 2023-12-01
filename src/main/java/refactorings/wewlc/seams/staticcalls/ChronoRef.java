package refactorings.wewlc.seams.staticcalls;

import java.util.Date;

import refactorings.wewlc.seams.extractnew.Chrono;

public class ChronoRef {

	public Date today() {
		return Chrono.today();
	}

	
}
