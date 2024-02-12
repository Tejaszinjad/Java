package edu.jsp.bi_onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.bi_onetoone.entity.Car;
import edu.jsp.bi_onetoone.entity.Engine;

public class SaveCar {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_onetoone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=new Car();
		car.setCarid(4);
		car.setBrand("Maruti");
		car.setModel("Baleno");
		car.setCost(1200000);
		
		Engine engine = new Engine();
		engine.setEngid(104);
		engine.setHp(115);
		engine.setName("h4");
		
		car.setEngine(engine);
		engine.setCar(car);
		
		transaction.begin();
		manager.persist(engine);
		manager.persist(car);
		transaction.commit();
		
	}

}
