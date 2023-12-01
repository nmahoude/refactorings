package refactorings.wewlc.datas;

import java.time.LocalDate;

public class UserDataTest {

	
	
	
	public static UserData createAdminUser() {
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

	
	
	public static UserData createGenericUser() {
		UserData user = new UserData();
		
		user.setFirstName("titi");
		user.setLastName("tata");
		user.setAddress("adr");
		user.setBirthDate(LocalDate.now());
		user.setMobile("06xxxxxxx");
		user.setTelephone("03xxxxxx");
		user.setRole("NORMAL");
		return user;
	}

}
