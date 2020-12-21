package nure.staffservice.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Identifier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	public Identifier() {
	}

	public Identifier(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
