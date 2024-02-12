package edu.jsp.computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Save {
	
public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("computer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Cpu cpu=new Cpu();
		cpu.setCpuid(106);
		cpu.setProcessor("abc");
		
		
		Computer comp = new Computer();
		
		comp.setBrand("Asus");
		comp.setCpu(cpu);
		comp.setModel("TUF Gaming f15");
		comp.setId(22);
		

		transaction.begin();
		manager.persist(comp);
		manager.persist(cpu);
		transaction.commit();
		
		
		System.out.println("Computer saved");
	}


}
