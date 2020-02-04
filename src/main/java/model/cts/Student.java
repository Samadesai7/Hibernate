package model.cts;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="StudentIdentity")
public class Student {
	@EmbeddedId
	private StudentIdentity sid;
	@Column(name="fnm",nullable=false)
	private String firstName;
	@Column(name="lnm")
	private String lastName;
	@Column(name="dob",nullable=false)
	private Date dateofbirth;
	public Student() {
		
	}
	public Student(StudentIdentity sid, String firstName, String lastName, Date dateofbirth) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofbirth = dateofbirth;
	}
	public StudentIdentity getSid() {
		return sid;
	}
	public void setSid(StudentIdentity sid) {
		this.sid = sid;
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
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", dateofbirth="
				+ dateofbirth + "]";
	}
	
}
