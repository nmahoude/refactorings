package refactorings.improving.codesmells.magicvalues;

import java.util.Random;

/** 
 * 
 * Don't use magic values (number, strings , ....) in your code
 * 
 * extract them in constant to explictly said what they represents
 * 
 * 
 * @author nmahoude
 *
 */
public class MagicValues {

	
	private void doSomeStuff() {
		int time = new Random().nextInt();
		
		if (time > 43200 /* try to find what this value represents */) {
			System.out.println("Plus grand");
		}
		
		String value = "XXXX"; // not this one, it's an example :)
		if (value.equals("HD")) { // imagine HD is not a wide used word in the domain (not in the Ubiquitous langage :) ), How can  
			System.out.println("Half Day");
		}
	}
}
