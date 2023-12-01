package refactorings.wewlc.datas;

import java.time.LocalDate;

public class UserDataBuilder {
	UserData user = new UserData();
	
	public static UserDataBuilder generic() {
		UserDataBuilder builder = new UserDataBuilder();
		
		builder.user.setFirstName("titi");
		builder.user.setLastName("tata");
		builder.user.setAddress("adr");
		builder.user.setBirthDate(LocalDate.now());
		builder.user.setMobile("06xxxxxxx");
		builder.user.setTelephone("03xxxxxx");
		builder.user.setRole("NORMAL");
		
		return builder;
	}

	public UserDataBuilder withRole(String role) {
		user.setRole(role);
		return this;
	}
	
	
	public UserDataBuilder withRoleAdmin() {
		user.setRole("ADMIN");
		return this;
	}
	
	public UserData build() {
		return user;
	}
}
