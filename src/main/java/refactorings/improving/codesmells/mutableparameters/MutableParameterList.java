package refactorings.improving.codesmells.mutableparameters;

import java.util.ArrayList;
import java.util.List;

/**
 * Don't pass parameters to method in order to modify them
 * it's magic and effects are not explicits
 * 
 * prefer returning the effects and let the client deals with it
 * 
 * @author nmahoude
 *
 */
public class MutableParameterList {

	public static void main(String[] args) {
		List<String> output = work();
		
		System.out.println(output);
		
	}

	static List<String> work() {
		List<String> output = new ArrayList<>();
		
		// remove output from the parameters lists
		addElements(output, "A", "B", "C"); 
		addElements(output, "D", "E");
		addElements(output, "F", "G");
		return output;
	}
	
	private static void addElements(List<String> output, String...names) {
		for (String name : names) {
			output.add(name);
		}
	}
	
	
}
