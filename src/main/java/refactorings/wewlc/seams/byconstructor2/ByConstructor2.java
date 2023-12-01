package refactorings.wewlc.seams.byconstructor2;

public class ByConstructor2 {
	Object service1;
	Object service2;
	
	
	public ByConstructor2() {
		service1 = new String("service 1");
		service2 = new String("service 2");
	}
	
	public ByConstructor2(Object service1, Object service2) {
		this.service1 = service1;
		this.service2 = service2;
	}
	
	
	public Object methodToTest() {
		return service1 + " " + service2;
	}
}
