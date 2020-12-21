package nure.staffservice.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "trainer_id"))
public class Trainer extends Identifier {

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "trainer_user_id")
	private User user;
	@Column(name = "trainer_name")
	private String firstName;
	@Column(name = "trainer_lastname")
	private String lastName;
	@Column(name = "trainer_rate")
	private double rate;

	public Trainer() {
	}

	public Trainer(int id, User user, String firstName, String lastName, double rate) {
		super(id);
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
