package nure.staffservice.dto;

public class InstructionsDto {

	public String name;
	public int equipmentCount;
	public int id;
	public long idd;

	public InstructionsDto() {
	}

	public InstructionsDto(String name, int equipmentCount) {
		this.name = name;
		this.equipmentCount = equipmentCount;
	}
}
