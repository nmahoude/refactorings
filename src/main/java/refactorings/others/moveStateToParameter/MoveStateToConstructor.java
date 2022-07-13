package refactorings.others.moveStateToParameter;

/**
 * 
 * when doing TDD, you first start by putting parameter as hardcoded values
 * 
 * This refactoring makes you play with how you can extract them in constructor parameter
 * 
 * The goal is to have a constructor that take "A" & 10 so the class is parametrizable
 * 
 */
public class MoveStateToConstructor {

  
  public int getValue(String condition) {
    if ("A".equals(condition)) {
      return 10;
    }
    return 0;
  }
  
}
