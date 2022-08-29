
public class Entry {
	
	private String firstName;
	private String lastName;
	private String phoneNumb;
	private String email;
	
	
	public Entry(String firstName, String lastName, String phoneNum, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumb = phoneNum;
		this.email = email;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getPhoneNumb() {
		return phoneNumb;
	}





	public void setPhoneNumb(String phoneNumb) {
		this.phoneNumb = phoneNumb;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	@Override
	public String toString() {
		return "First Name: " + getFirstName() + " Last Name: " + getLastName() + " Phone Number: " + getPhoneNumb() + " Email address: "
				+ getEmail();
	}

}
