package refactorings.improving.codesmells.duplicatedcode.dups;

public class DuplactedCat {
  int position_x;
  int position_y;
  
  public void walk() {
    this.position_x += 1;
  }

  public void walkFast() {
    this.position_x += 3;
  }

  public void meaow() {
    System.out.println("meaow");
  }
}
