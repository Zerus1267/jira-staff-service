package nure.staffservice.dto;

public class ClientDto {

	public String firstName;
	public String lastName;
	public UserDto userDto;
	public int id;

	public ClientDto() {
	}

	public ClientDto(String firstName, String lastName, UserDto userDto) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userDto = userDto;
	}
}
