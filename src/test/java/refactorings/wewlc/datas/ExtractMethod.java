package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ExtractMethod {

	
	
	@Test
	void makeItWork() throws Exception {
		UserData user = createAdminUser();

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isTrue();
	}

	private UserData createAdminUser() {
		UserData user = new UserData();
		
		user.setFirstName("titi");
		user.setLastName("tata");
		user.setAddress("adr");
		user.setBirthDate(LocalDate.now());
		user.setMobile("06xxxxxxx");
		user.setTelephone("03xxxxxx");
		user.setRole("ADMIN");
		return user;
	}
}
