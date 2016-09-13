package gov.nist.healthcare.hl7tools.domain;

public class Person extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8643858098782542845L;

	private String firstName;
	private String lastName;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
