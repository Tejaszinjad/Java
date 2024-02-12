package edu.jsp.computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Search {
	
	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("computer");
		EntityManager manager = factory.createEntityManager();
		
		
		Computer comp = manager.find(Computer.class, "ASUS");
		Cpu cpu=comp.getCpu();
		
		System.out.println("=========================================");
		System.out.println(comp.getBrand());
		System.out.println(comp.getModel());
		
		System.out.println("Computer Foundd...");
		}
		
	}

	
	
	
	
	
	
	
	





