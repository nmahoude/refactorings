package refactorings.improving.codesmells.loops;

import java.util.Arrays;
import java.util.List;

/**
 * Use stream & lambda to loop over elements
 * 
 * Note:
 *  Don't overuse it ! Stream with 10 filter & maps are unreadable
 *  Prefere short composition, and extract to methods if needed
 * 
 * -> filter
 * -> map
 * 
 * 
 * Refactorings:
 *  Replace loop with pipeline 
 *
 */
public class Loops {

  /**
   * simple stream here
   */
  void simpleLoop() {
    List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
    
    for (Integer i : ints) {
      System.err.println("i = "+i);
    }
  }
  
  
  
}
