package in.javahome.springmvc.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "STUDENTS")
public class Student {
	@Id
	@GeneratedValue
	private Integer stdId;

	@NotEmpty(message = "Name is Mandatory")
	@Min(value = 4, message = "Name should contain minimum 4 characters")
	private String name;
	@Pattern(regexp = "[0-9]{10}", message = "Not a valid phone number")
	private String phone;
	private String course;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PASSPORT_NO")
	private Passport passport;

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
