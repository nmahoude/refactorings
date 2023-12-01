package refactorings.others.recursiveChange;


/**
 * Imagine you want to change a method signature recursively,
 * Imagine that this method are not in the same class (which is not the case here for simplicity)
 * let's say the 2 objects share the same interface (here: public variables)
 *  
 * how would you do with your IDE ?
 * 
 * change all methods signature from A to B with refactoring (not search/replace)
 * 
 * 
 */
public class RecursiveChange {
  static class A {
    boolean p1, p2, p3, p11;
  }
  
  static class B {
    boolean p1, p2, p3, p11;
  }

  public void accept(A a) {
    accept1(a);
    accept2(a);
    accept3(a);
  }

  private void accept3(A a) {
  }

  private void accept2(A a) {
  }

  private void accept1(A a) {
    accept11(a);
  }

  private void accept11(A a) {
  }
  
  
}
