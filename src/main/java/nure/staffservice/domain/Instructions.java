package nure.staffservice.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "program")
@AttributeOverride(name = "id", column = @Column(name = "pkprogramid"))
public class Instructions extends Identifier {

	@Column(name = "programName")
	private String name;
	@Column(name = "equipmentCount")
	private int equipmentCount;

	public Instructions() {
	}

	public Instructions(int id, String name, int equipmentCount) {
		super(id);
		this.name = name;
		this.equipmentCount = equipmentCount;
	}

	public Instructions(String name, int equipmentCount) {
		this.name = name;
		this.equipmentCount = equipmentCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEquipmentCount() {
		return equipmentCount;
	}

	public void setEquipmentCount(int equipmentCount) {
		this.equipmentCount = equipmentCount;
	}
}
