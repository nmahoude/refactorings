package refactorings.improving.codesmells.mutableparameters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MutableParameterListTest {

	
	@Test
	void workIsDone() throws Exception {
			Assertions.assertThat(MutableParameterList.work()).containsExactly("A", "B", "C", "D", "E", "F", "G");
	}
}
