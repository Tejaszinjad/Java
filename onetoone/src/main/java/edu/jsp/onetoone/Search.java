package edu.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Search {
	
	public static void main(String[]args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Car car=manager.find(Car.class, 2);
		Engine engine=car.getEngine();
		System.out.println("===========");
		System.out.println(car.getCarid());
		System.out.println(car.getBrand());
		System.out.println(car.getCost());
		System.out.println(car.getModel());
		System.out.println(car.getEngine());
		
		
		
		
		System.out.println("car found");
	
	}

}
