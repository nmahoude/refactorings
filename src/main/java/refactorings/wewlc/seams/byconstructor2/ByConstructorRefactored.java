package refactorings.wewlc.seams.byconstructor2;

public class ByConstructorRefactored {
	Object service1 = new String("service 1");
	Object service2 = new String("service 2");
	
	
	public ByConstructorRefactored() {
		
	}
	
	public Object methodToTest() {
		return service2;
	}
}
