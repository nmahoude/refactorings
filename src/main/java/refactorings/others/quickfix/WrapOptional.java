package refactorings.others.quickfix;

import java.util.Optional;

public class WrapOptional {

	
	public static Optional<WrapOptional> getOptional() {
		// comment the return & uncomment the line under & make it compile with the quick fix (ctrl+1)
		// 1. with a direct Optional (no check for null, which would throw an exception)
		// 2. with a nullableOption (accept null as a value)
		
		
		return null;
//		 return new WrapOptional();
	}
}
