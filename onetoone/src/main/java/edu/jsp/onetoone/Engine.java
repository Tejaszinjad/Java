package edu.jsp.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
public class Engine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "my_seq")
	@SequenceGenerator(name="My-seq",initialValue = 100,allocationSize = 2 , sequenceName = "My-cust-sequence")
	private int engid;
	private String name;
	private double hp;
	
	
	public int getEngid() {
		return engid;
	}
	public void setEngid(int engid) {
		this.engid = engid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public Engine() {
		super();
	}
	

}
