
public class CustomerAuth {

	public String username;
	public String password;
	
	public CustomerAuth() {
		this.username = "theodore";
		this.password = "123";
	}
	
	public CustomerAuth(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public CustomerAuth(CustomerAuth UserAuthen) {
		this.password = UserAuthen.password;
		this.password = UserAuthen.username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}  

	@Override
	public String toString() {
		return "Employee credentials: Username=" + username + ", Password=" + password + "]";
	}
	
	
}
