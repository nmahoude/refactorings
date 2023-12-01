package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExtractMethodWhereBelongs {

	
	
	@Test
	void extractMethodWhereItBelongs() throws Exception {
		UserData user = new UserDataTest().createAdminUser();

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isTrue();
	}

}
