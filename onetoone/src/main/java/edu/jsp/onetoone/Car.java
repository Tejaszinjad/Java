package edu.jsp.onetoone;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "my_tab")
	@TableGenerator(name = "My-tab", initialValue = 100, allocationSize = 2, table = "My-cust-table")
	private int carid;
	private String model;
	private String brand;
	private double cost;

	@OneToOne(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Car() {
		super();
	}

}
