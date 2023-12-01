
package refactorings.wewlc.seams.ios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class IORefactoredTest {

	static class ConsoleTest extends Console {
		private String message;

		@Override
		public void println(String msg) {
			this.message = msg;
		}
	}
	
	@Test
	void outputIsAvant() throws Exception {

		ConsoleTest console = new ConsoleTest();
		new IORefactored(console).methodToTest();
		
		Assertions.assertThat(console.message).isEqualTo("Avant");
		
	}
}
