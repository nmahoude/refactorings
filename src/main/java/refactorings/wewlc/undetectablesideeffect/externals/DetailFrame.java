package refactorings.wewlc.undetectablesideeffect.externals;

public class DetailFrame {

  public void setDescription(String string) {
    throw new RuntimeException("dont call me");
  }

  public void show() {
    throw new RuntimeException("dont call me");
  }

  public String getAccountSymbol() {
    throw new RuntimeException("dont call me");
  }

}
