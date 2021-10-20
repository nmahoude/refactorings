package ide.tools.pullup;

/** 
 * 
 * use the pull up tool to pull up methods 
 * 
 */
public class PullTheMethodUp {

	
	static class Inner extends PullTheMethodUp {
		private int value;
		private int tiedValue;
		
		/* pull up is enable */
		public void command() {
			System.out.println("inner command without link to class's fields");
		}
		
		/* you can't move this method up directly, need to pull up the value too */ 
		public void commandWithField() {
			System.out.println("inside "+value);
		}
		
		/* pulling this method + field will change the scope of tiedValue */
		public void commandWithTiedValue() {
			System.out.println("inside "+tiedValue);
		}

		public void anotherCommandWithTiedValue() {
			System.out.println("inside another "+tiedValue);
		}
	
		public void commonMethod() {
			System.out.println("common with 2 subclasses");
		}
	}
	
	static class SecondInner extends PullTheMethodUp {
		/* pulling this method up won't touch the other class identical method */
		public void commonMethod() {
			System.out.println("common with 2 subclasses");
		}
	}
}
