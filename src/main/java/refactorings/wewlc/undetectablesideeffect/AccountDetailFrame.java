package refactorings.wewlc.undetectablesideeffect;

import refactorings.wewlc.undetectablesideeffect.externals.ActionEvent;
import refactorings.wewlc.undetectablesideeffect.externals.ActionListener;
import refactorings.wewlc.undetectablesideeffect.externals.DetailFrame;
import refactorings.wewlc.undetectablesideeffect.externals.Frame;
import refactorings.wewlc.undetectablesideeffect.externals.TextField;
import refactorings.wewlc.undetectablesideeffect.externals.WindowListener;

/**
 *  Objectives :
 *  actionPerformed has big side effects (mainly GUI related), 
 *  refactor the class so that it is testable
 *
 *  Based on "working effectively with legacy code" by M.Feathers
 */
public class AccountDetailFrame extends Frame
    implements ActionListener, WindowListener {
  private TextField display = new TextField(10);

  public AccountDetailFrame() {

  }

  public void actionPerformed(ActionEvent event) {
    String source = (String) event.getActionCommand();
    if (source.equals("project activity")) {
      DetailFrame detailDisplay = new DetailFrame();
      detailDisplay.setDescription(
          getDetailText() + " " + getProjectionText());
      detailDisplay.show();
      String accountDescription = detailDisplay.getAccountSymbol();
      accountDescription += ": ";
      display.setText(accountDescription);
    }
  }

  private String getProjectionText() {
    return "t1";
  }

  private String getDetailText() {
    return "t2";
  }
}
