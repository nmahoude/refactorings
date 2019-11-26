package refactorings.improving.codesmells.duplicatedcode.dups;

public class DuplicatedDog {
  int position_x;
  int position_y;
  
  public void walk() {
    this.position_x += 2;
    this.position_y += 1;
  }
  
  public void bark() {
    System.out.println("woof");
  }
}
