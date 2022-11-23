package refactorings.improving.codesmells.primitiveobsession;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 *
 *  Example :
 *  A List is not a good container for something that has always 2 elements
 *  
 *  In this exercice, replace the List with an Object that represents the values
 *  
 *  Refactorings:
 *  @see Replace primitive with object
 *  @see Replace type code with subclasses
 *  @see Replace conditional with polymorphism
 *  @see Extract class
 *  @see Introduce parameter object
 */
public class PrimitiveObsessionListToObject {

  public static void main(String[] args) {
  	List<LocalDate> dates = getPeriodInfo();
  	
  	LocalDate now = LocalDate.now();
  	if (dates.size() >= 2 
  			&& dates.get(0) != null 
  			&& dates.get(1) != null 
  			&& dates.get(0).isBefore(now) 
  			&& dates.get(1).isAfter(now)) {
  		System.out.println("Inside !");
  	}
  	
  	
	}
  
  /** Should return an object, can you find what the list represents ? */  
  private static List<LocalDate> getPeriodInfo() {
  	return Arrays.asList(LocalDate.of(1, 1, 1), LocalDate.of(10000, 10, 10));
	}

}