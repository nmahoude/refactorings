package refactorings.wewlc.seams.extractmethod;

import org.junit.jupiter.api.Test;

public class ExtractMethodTest {

	
	@Test
	void testName() throws Exception {
		
		ExtractMethod sut = new ExtractMethod() {
			@Override
			protected void wishYouWereNotHere(Object o) {
			}
		};

		// ....
	}
}
