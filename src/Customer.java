import java.util.Random;
import java.util.UUID;

public class Customer {

	//auto generate function for this 
	public String CustomerId;
	
	//thinking about disecting this for normalization (first and last name);
	public String name;
	public String email;
	
	//special attention to these as they are needed for the password 
	public String username;
	public String password;
	
	public Customer() {
		
		this.CustomerId = UUID.randomUUID().toString();//generatePassword(8);
		this.name = "Theodore";
		this.email = "tp@gmail.com";
		this.username = "theo12";
		this.password = "oneking";
	}
	
	
	public Customer(String customerId, String name, String email, String username, String password) {
		
		
		this.CustomerId = customerId;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	//password generator.
	
	/*
	 * private static char[] generatePassword(int length) { String
	 * capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; String lowerCaseLetters =
	 * "abcdefghijklmnopqrstuvwxyz"; String specialCharacters = "!@#$"; String
	 * numbers = "1234567890"; String combinedChars = capitalCaseLetters +
	 * lowerCaseLetters + specialCharacters + numbers; Random random = new Random();
	 * char[] password = new char[length];
	 * 
	 * password[0] =
	 * lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	 * password[1] =
	 * capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	 * password[2] =
	 * specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	 * password[3] = numbers.charAt(random.nextInt(numbers.length()));
	 * 
	 * for(int i = 4; i< length ; i++) { password[i] =
	 * combinedChars.charAt(random.nextInt(combinedChars.length())); } return
	 * password; }
	 */

	public String getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
		return "Customer [ customer id = "+ CustomerId +", name=" + name + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}


	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		System.out.println(c1);
		
	}
	
}

