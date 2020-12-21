package nure.staffservice.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "user_id"))
public class User extends Identifier {

	@Column(name = "user_login")
	private String loginName;
	@Column(name = "user_password")
	private String password;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_role")
	private Role role;

	public User() {
	}

	public User(int id, String liginName, String password, Role role) {
		super(id);
		this.loginName = liginName;
		this.password = password;
		this.role = role;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
