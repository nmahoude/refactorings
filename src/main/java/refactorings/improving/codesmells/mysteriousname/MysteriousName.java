package refactorings.improving.codesmells.mysteriousname;

/**
 * 
 * Naming is hard
 * 
 * We read code far more than we write it, so let it be clear and expressive
 * Expliciting the implicts
 *
 * Don't be shy to rename concept, classes, methods, variables
 * 
 * Refactorings
 * @see Change function declaration 
 * @see Move function
 * @see Extract superclass
 * 
 */
public class MysteriousName {
  
  double r;
  
  public double circum() {
    return 2 * Math.PI * r;
  }
  
  public double r() {
    return r;
  }
}
