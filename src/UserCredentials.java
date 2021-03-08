
public class UserCredentials {

	public String username;
	public String password;
	
	public UserCredentials() {
		this.username = "theodore";
		this.password = "Client20";
	}
	
	public UserCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public UserCredentials(UserCredentials UserAuthen) {
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
		return "User Credentials : Username=" + username + ", Password=" + password + "]";
	}
	
	
}
