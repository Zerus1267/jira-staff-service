package nure.staffservice.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "client_id"))
public class Client extends Identifier {

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
			@JoinColumn(name = "client_user_id")
	User user;
	@Column(name = "client_name")
	String firstName;
	@Column(name = "client_lastname")
	String lastName;
	@Column(name = "client_mass")
	double weight;

	public Client() {
	}

	public Client(int id, User user, String firstName, String lastName, double weight) {
		super(id);
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
