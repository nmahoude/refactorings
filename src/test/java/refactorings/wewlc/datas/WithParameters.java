package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class WithParameters {

	
	
	@Test
	@CsvSource({"NORMAL, false, "
			      + "ADMIN, true"})
	void staticFactoryExplicit(String role, boolean expected) throws Exception {
		UserData user = UserDataBuilder.generic()
												.withRole(role)
												.build();

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isEqualTo(expected);
	}

}
