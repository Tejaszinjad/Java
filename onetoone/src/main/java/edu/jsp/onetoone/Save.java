package edu.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	
	public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Engine engine=new Engine();
		engine.setName("sstt");
		engine.setHp(17.9);

		
		
		Car car=new Car();
		car.setModel("Mustang");
		car.setBrand("Ford");
		car.setCost(7000000);
		
		
		
		transaction.begin();
		car.setEngine(engine);
		manager.persist(car);
		transaction.commit();
		
		
		System.out.println("car saved");
	}

}
