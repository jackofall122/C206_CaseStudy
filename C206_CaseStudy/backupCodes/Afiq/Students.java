package Afiq;

public class Students {

	private String name;
	private String gender;
	private String mobile;
	private String email;
	private String dob;
	private String country;
	private String interest;
	
	public Students(String name, String gender, String mobile, String email, String dob, String country, String interest) {
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.country = country;
		this.interest = interest;
	}
	public String toString() {
		String studentInfo = String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s", name, gender, mobile, email, dob, country, interest);
		return studentInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
}