package refactorings.wewlc.datas;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class MakeItWork {

	
	
	@Test
	void makeItWork() throws Exception {
		UserData user = new UserData();
		
		user.setFirstName("titi");
		user.setLastName("tata");
		user.setAddress("adr");
		user.setBirthDate(LocalDate.now());
		user.setMobile("06xxxxxxx");
		user.setTelephone("03xxxxxx");
		user.setRole("ADMIN");

		boolean isAdmin = user.isAdmin();
		
		assertThat(isAdmin).isTrue();
	}
}
