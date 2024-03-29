package refactorings.improving.codesmells.primitiveobsession;

/**
 *
 *  Example :
 *  A string is not a good container for a username when there is domain rules to apply to it
 *  
 *  In this exercice, replace the String with an Object that contains the rules
 *  
 *  Refactorings:
 *  @see Replace primitive with object
 *  @see Replace type code with subclasses
 *  @see Replace conditional with polymorphism
 *  @see Extract class
 *  @see Introduce parameter object
 */
public class PrimitiveObsessionCreateAnObject {
  String username;

  /*
   * insert a Username object
   */
  public void setUserName(String username) {
    if (username.contains(" ")) {
      throw new RuntimeException("bad user name"); 
    }
    if (username.isEmpty()) {
      throw new RuntimeException("bad user name"); 
    }
    this.username = username;
  }

  
  public static void main(String[] args) {
		var case1 = new PrimitiveObsessionCreateAnObject();
		case1.setUserName("All_very_good");
		System.out.println(case1.username);

		/** 
		 * This one throw, we dont want to handle the check in our PrimitiveObsessionToObject, but inside the Username Object 
		 * 
		 * So the PrimitiveObsessionToObject accept an Username object and be sure he is valid
		 * **/
		var case2 = new PrimitiveObsessionCreateAnObject();
		case2.setUserName("ooopps there is a space");
		
		
		
		
	}
}
