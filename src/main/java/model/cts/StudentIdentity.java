package model.cts;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class StudentIdentity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "StudentIdentity [rollnumber=" + rollnumber + ", section=" + section + ", clazz=" + clazz + "]";
	}
	private static final long serialVerssionUID=1L;
	private int rollnumber;
	private char section;
	private int clazz;
	public StudentIdentity() {
		
	}
	public StudentIdentity(int rollnumber, char section, int clazz) {
		super();
		this.rollnumber = rollnumber;
		this.section = section;
		this.clazz = clazz;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getClazz() {
		return clazz;
	}
	public void setClazz(int clazz) {
		this.clazz = clazz;
	}
	public static long getSerialverssionuid() {
		return serialVerssionUID;
	}
	
	

}
