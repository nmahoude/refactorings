package refactorings.improving.codesmells.featurenvy;

import refactorings.improving.codesmells.featurenvy.envy.WantToBe;

/**
 * Feature envy:
 * **************
 * When a method in an object deals more with another object
 * it's the sign that it should go inside this object
 * 
 * @see Move function
 * @see Extract function 
 *
 */
public class FeatureEnvy {
  int intern;
  WantToBe wannaBe = new WantToBe();
  
  /* move wannaBe use in wannaBe ...
   * 
   * let's say the code dealing with wannaBe represents the behavoir of wannaBe.currentRatio()
   * 
   */
  public int calculate() {
    return intern * (
        wannaBe.initial()
        +wannaBe.second()
        + wannaBe.third() * wannaBe.ratio());
  }
}
