package refactorings.wewlc.seams.specialcasetime;

import java.util.Date;

public class Chrono {

	static Date fixedDate = null;

	private Chrono() {
	}
	
	
	public static Date today() {
		if (fixedDate == null) {
			return new Date();
		} else {
			return fixedDate;
		}
	}
	
	protected static void fixTheDate(Date theDate) {
		Chrono.fixedDate = theDate;
	}
	
	protected static void clearTheDate() {
		Chrono.fixedDate = null;
	}
	
}
