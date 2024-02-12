package edu.jsp.computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	
	public static void main(String[]args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("computer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Computer comp=manager.find(Computer.class, 21);
		if(comp!=null) {
			transaction.begin();
			comp.setBrand("HP");
			comp.setModel("efg");
			manager.merge(comp);
			transaction.commit();
		}
		else {
			System.out.println(" Computer not updated");
		}
		
		
		Cpu cpu=manager.find(Cpu.class,105);
		if(cpu!=null) {
			
			transaction.begin();
			cpu.setProcessor("AMD");
			manager.merge(cpu);
			transaction.commit();
		}
		else {
			System.out.println("CPU not updated");
		}
	}

}
