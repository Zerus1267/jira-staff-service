package nure.staffservice.dto;

public class UserDto {

	public String firstName;
	public String lastName;
	public double rate;

	public UserDto(String firstName, String lastName, double rate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
	}

	public UserDto() {
	}

}
