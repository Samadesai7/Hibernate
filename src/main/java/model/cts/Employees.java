package model.cts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Table(name="Employees")
//@DiscriminatorColumn(name="emp_type",
//discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("employee")
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
//@Table(name="Employees1")
@Table(name="Employee2")
public class Employees {
	@Id
	@Column(name="eid")
	private long eid;
	@Column(name="eName")
	private String eName;
	@Column(name="basic")
	private double basic;
	public Employees() {
	
	}
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employees(long eid, String eName, double basic) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.basic = basic;
	}
	

}
