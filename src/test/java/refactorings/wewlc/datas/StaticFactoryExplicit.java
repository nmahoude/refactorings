package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StaticFactoryExplicit {

	
	
	@Test
	void staticFactoryExplicit() throws Exception {
		UserData user = UserDataTest.createGenericUser();
		user.setRole("ADMIN");

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isTrue();
	}

}
