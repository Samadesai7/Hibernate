package model.cts;
import model.cts.Employees;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
//@DiscriminatorValue("mang")
//@Table(name="mang1")
@Table(name="mang2")
public class ManagerEmp extends Employees{
	@Column(name="allowance")
	private Double allowance;
    public ManagerEmp() {
		
	}
	public ManagerEmp(long eid, String eName, double basic,double allowance) {
		super(eid,eName,basic);
		this.allowance = allowance;
	}


	public Double getAllowance() {
		return allowance;
	}

	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}

	

}
