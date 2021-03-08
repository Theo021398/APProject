
public class Products {

	public String Broadband;
	public String Mobile;
	public String Home_Phone;
	
	
	public Products(String broadband, String mobile, String home_Phone) {
		
		Broadband = broadband;
		Mobile = mobile;
		Home_Phone = home_Phone;
	}
	
	public Products() {
			
			Broadband = "Internet box";
			Mobile = "Samsung series 5 repair";
			Home_Phone = "Cordless phone connection";
		}

	public String getBroadband() {
		return Broadband;
	}

	public void setBroadband(String broadband) {
		Broadband = broadband;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getHome_Phone() {
		return Home_Phone;
	}

	public void setHome_Phone(String home_Phone) {
		Home_Phone = home_Phone;
	}
	
	
}
