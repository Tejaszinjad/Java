package edu.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	
	public static void main(String[]args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Car car=manager.find(Car.class, 77);
		if(car!=null) {
			
			car.setBrand("Mustang");
			car.setModel("GT");
			car.setCost(7500000);
		
			
			transaction.begin();
			manager.merge(car);
			transaction.commit();
		}
		else {
			System.out.println("not updated");
		}
		
		
		Engine engine=manager.find(Engine.class,5);
		if(engine!=null) {
			
			engine.setHp(98.0);
			engine.setName("ssss");
			
			transaction.begin();
			manager.merge(engine);
			transaction.commit();
		}
		else {
			System.out.println("engine not updated");
		}
	}

}
