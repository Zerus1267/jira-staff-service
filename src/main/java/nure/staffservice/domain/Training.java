package nure.staffservice.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "training_id"))
public class Training extends Identifier {

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
			@JoinColumn(name = "fktrainerid")
	private Trainer trainer;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
			@JoinColumn(name = "fkclientid")
	private Client client;
	@Column(name = "rate")
	private double rate;
	@Column(name = "date")
	private Date date;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "fkprogramid")
	private Instructions instructions;

	public Training() {
	}

	public Training(int id, Trainer trainer, Client client, double rate, Date date, Instructions instructions) {
		super(id);
		this.trainer = trainer;
		this.client = client;
		this.rate = rate;
		this.date = date;
		this.instructions = instructions;
	}

	public Training(Trainer trainer, Client client, Date date, Instructions instructions) {
		this.trainer = trainer;
		this.client = client;
		this.date = date;
		this.instructions = instructions;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Instructions getInstructions() {
		return instructions;
	}

	public void setInstructions(Instructions instructions) {
		this.instructions = instructions;
	}
}
