package nure.staffservice.dto;

public class LoginForm {

	public String login;
	public String password;
	public String token;

	public boolean isValid() {
		return !login.isEmpty() && !password.isEmpty() && !token.isEmpty();
	}

	public LoginForm(String login, String password, String token) {
		this.login = login;
		this.password = password;
		this.token = token;
	}

	public LoginForm() {
	}
}
