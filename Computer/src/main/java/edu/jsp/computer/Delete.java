package edu.jsp.computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	
public static void main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("computer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Computer comp=manager.find(Computer.class, 21);
		if(comp!=null) {
			transaction.begin();
			manager.remove(comp);
			transaction.commit();
			System.out.println("Computer deleted");
			
		}
		else {
			System.out.println("Computer not found");
		}
	}

}
