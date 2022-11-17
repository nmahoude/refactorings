package refactorings.improving.codesmells.dataclumps;

import java.time.LocalDateTime;

/**
 * Dataclumps are data that 'move' together and have a domain  meaning
 * When you see such data in the code that are not modeled by an object, transform it
 * You can even benefit more by moving responsabilities of the dataclumps from the code to this new object
 * 
 * In this exercice, start and end represents a Period of Time.
 * The existing method should remain, but delegates to a new public one that take the Object as parameter
 * no code responsible for handling dates should remain in this class (guard clauses included)
 * So Extract this Object and use this occasion to move the code that is checking if a date is in the period
 * 
 * 
 * 
 * @author nmahoude
 *
 */
public class DataClumpsAsAPeriod {
	
	public void doSomeStuff(LocalDateTime start, LocalDateTime end) {
		if (start == null || end == null) {
			throw new RuntimeException("Dates can't be null");
		}
		if (start.isAfter(end)) {
			throw new RuntimeException("Oppps start after end");
		}
		
		LocalDateTime now = LocalDateTime.now();
		
		if (start.isBefore(now) && end.isAfter(now)) {
			System.out.println("INSIDE");
		}
		
	}
	
	public static void main(String[] args) {
		
		new DataClumpsAsAPeriod().doSomeStuff(LocalDateTime.of(2000,  01, 01, 00, 00), LocalDateTime.of(2050, 01, 01, 23, 59));
		
	}
	
	
}
