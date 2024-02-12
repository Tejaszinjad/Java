package edu.jsp.computer;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cpu {
	
	@Id
private int cpuid;
private String processor;


public Cpu() {
	super();
	
	
}
public int getCpuid() {
	return cpuid;
}
public void setCpuid(int cpuid) {
	this.cpuid = cpuid;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}

}
