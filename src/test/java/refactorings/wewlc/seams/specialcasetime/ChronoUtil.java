package refactorings.wewlc.seams.specialcasetime;

import java.util.Date;

public class ChronoUtil {

	public static void fixTheDate(Date date) {
		Chrono.fixTheDate(date);
	}
	
	public static void clearDate() {
		Chrono.clearTheDate();
	}
}
