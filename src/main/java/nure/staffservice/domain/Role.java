package nure.staffservice.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "role_id"))
public class Role extends Identifier {

	@Column(name = "role_name")
	private String roleName;

	public Role() {
	}

	public Role(int id, String roleName) {
		super(id);
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean isTrainer() {
		return this.id == 3;
	}

	public boolean isClient() {
		return this.id == 2;
	}
}
