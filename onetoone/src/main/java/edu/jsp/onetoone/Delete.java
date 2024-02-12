package edu.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	
	public static void main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Car car=manager.find(Car.class, 2);
		if(car!=null) {
			transaction.begin();
			manager.remove(car);
			transaction.commit();
			System.out.println("car deleted");
			
		}
		else {
			System.out.println("car not found");
		}
	}

}
