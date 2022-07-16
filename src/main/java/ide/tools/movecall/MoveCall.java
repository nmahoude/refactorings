package ide.tools.movecall;

import ide.tools.movecall.supportpackage.Receiving;

/**
 * 
 * Move the call from this class into the receiving class
 * 
 * @author nmahoude
 *
 */
public class MoveCall {
	Receiving receiving = new Receiving();
	private int total;
	
	public static void main(String[] args) {
		MoveCall moveCall = new MoveCall();
		moveCall.doIt();
	}
	
	private void doIt() {
		addToReceiving(new Object());
	}


	/**
	 * this method need to move into Receiving with the use of refactorings
	 * 
	 * what we want is using : receiving.add(object); with same effects !
	 * 
	 * And don't touch this.total++ !
	 * 
	 */
	public void addToReceiving(Object object) {
		receiving.getList().add(object);
		this.total++;
	}
}
