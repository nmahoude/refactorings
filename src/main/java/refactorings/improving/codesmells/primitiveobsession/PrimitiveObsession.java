package refactorings.improving.codesmells.primitiveobsession;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *  Example :
 *  A string is not a good container for a username when there is domain rules to apply
 *  
 *  Refactorings:
 *  @see Replace primitive with object
 *  @see Replace type code with subclasses
 *  @see Replace conditional with polymorphism
 *  @see Extract class
 *  @see Introduce parameter object
 */
public class PrimitiveObsession {
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
  }

  /**
   * extract an Order class/object
   */
  public List<String> filterOrders(List<String> orders) {
    
    return orders.stream()
                .filter(o -> o.equals("high") || o.equals("very high"))
                .collect(Collectors.toList());
  }
  
}
