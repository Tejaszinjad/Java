package edu.jsp.bi_onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.bi_onetoone.entity.Car;


public class DeleteCar {
	
public static void main(String[]args) {
		
		
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_onetoone");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	Car car=manager.find(Car.class, 3);
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
