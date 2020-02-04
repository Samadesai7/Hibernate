package model.cts;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
//@DiscriminatorValue("ContEmp")
//@Table(name="Cems1")
@Table(name="Cems2")
public class ContractEmp extends Employees {
	@Column(name="duration")
	private int duration;
	
	public ContractEmp() {
		
	}
	public ContractEmp(long eid, String eName, double basic,int duration) {
		super(eid, eName, basic);
		this.duration=duration;
		// TODO Auto-generated constructor stub
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}

	public ContractEmp(int duration) {
		super();
		this.duration = duration;
	}

}
