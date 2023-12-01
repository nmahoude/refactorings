package refactorings.others.extractWithConstructor;

/**
 * Sometimes your object grows too big and you see a possible decomposition
 * 
 *  In this exercice, extract all variables starting with 'b' into a new objet 'B' using refactoring from your IDE 
 *  You should not alter the interface of this Class
 */
public class ExtractObjectWithConstructor {

  private int a1;
  private int a2;
  private int a3;
  private int a4;

  // to extract
  private int b1;
  private int b2;
  private int b3;
  private int b4;
  // --
  
  public ExtractObjectWithConstructor(int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4) {
    super();
    this.a1 = a1;
    this.a2 = a2;
    this.a3 = a3;
    this.a4 = a4;
    
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
  }

  public int a1() {
    return a1;
  }

  public int a2() {
    return a2;
  }

  public int a3() {
    return a3;
  }

  public int a4() {
    return a4;
  }

  public int b1() {
    return b1;
  }

  public int b2() {
    return b2;
  }

  public int b3() {
    return b3;
  }

  public int b4() {
    return b4;
  }
  
  
  
  
}
