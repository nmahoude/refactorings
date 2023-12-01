package refactorings.wewlc.seams.byconstructor1;

public class ByConstructeur1 {
	Object service1;
	Object service2;
	
	
	public ByConstructeur1(Object service1, Object service2) {
		super();
		this.service1 = service1;
		this.service2 = service2;
	}
	
	public Object methodToTest() {
		return null;
	}
}
