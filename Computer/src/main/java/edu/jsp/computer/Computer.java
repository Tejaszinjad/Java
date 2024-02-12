package edu.jsp.computer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Computer {
	
	@Id
	private int id;
	private String brand;
    private String model;
   
    @OneToOne
    private Cpu cpu;




    public Cpu getCpu() {
    	return cpu;
    }

    public void setCpu(Cpu cpu) {
    	this.cpu = cpu;
    }


    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}



public Computer() {
	super();
}



 
 
	 

}
