package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class WithBuilderWithMeaning {

	
	
	@Test
	void staticFactoryExplicit() throws Exception {
		UserData user = UserDataBuilder.generic()
												.withRoleAdmin()
												.build();

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isTrue();
	}

}
