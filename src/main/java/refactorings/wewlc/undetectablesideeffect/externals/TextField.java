package refactorings.wewlc.undetectablesideeffect.externals;

public class TextField {

  public TextField(int i) {
  }

  public void setText(String accountDescription) {
    throw new RuntimeException("dont call me");
  }

}
