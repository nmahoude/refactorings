package refactorings.improving.codesmells.primitiveobsession;

/**
 *
 * Example : A string is not a good container for value that can only one of
 * multiple known values
 * 
 * In this exercice, replace the String with an Enum representing the possible
 * values
 * 
 * Refactorings:
 * 
 * @see Replace primitive with object
 * @see Replace type code with subclasses
 * @see Replace conditional with polymorphism
 * @see Extract class
 * @see Introduce parameter object
 */
public class PrimitiveObsessionToEnum {
	String type;

	/*
	 * insert a Username object
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * extract an Order class/object
	 */
	public String type() {
		return type;
	}

	public static void main(String[] args) {
		String commingFromElsewhere = "TYPE0";

		// this one come from somewhere else in our code, we don't want to check if it's valid
		var type0 = new PrimitiveObsessionToEnum();
		type0.setType(commingFromElsewhere);

		var type1 = new PrimitiveObsessionToEnum();
		type1.setType("TYPE1");

		var type2 = new PrimitiveObsessionToEnum();
		type2.setType("TYPE2");

		/** oops not a valid type in the domain! should not be possible */
		var type3 = new PrimitiveObsessionToEnum();
		type3.setType("UNKNOWN TYPE");

		
		System.out.println(type0.type());
		System.out.println(type1.type());
		System.out.println(type2.type());

		/** Just to show that Enum can be compared with ==, but not String in all circonstances */
		
		if (type0.type().equals("TYPE0") && type1.type().equals("TYPE1") && /** and ... oops */
		    type1.type() == "TYPE2") {
			System.out.println("OK");
		}

	}
}
