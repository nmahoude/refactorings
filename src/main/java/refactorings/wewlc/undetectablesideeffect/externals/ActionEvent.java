package refactorings.wewlc.undetectablesideeffect.externals;

public class ActionEvent {

  public String getActionCommand() {
    throw new RuntimeException("Don't call me");
  }

}
