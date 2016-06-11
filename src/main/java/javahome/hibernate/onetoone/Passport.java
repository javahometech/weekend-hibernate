package javahome.hibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passport {
	@Id
	private String passportId;
	@Column
	String name;
	@OneToOne(mappedBy="passport")
	private Employee employee;

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
