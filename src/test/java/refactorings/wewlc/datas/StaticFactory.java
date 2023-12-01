package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StaticFactory {

	
	
	@Test
	void staticFactory() throws Exception {
		UserData user = UserDataTest.createAdminUser();

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isTrue();
	}

}
