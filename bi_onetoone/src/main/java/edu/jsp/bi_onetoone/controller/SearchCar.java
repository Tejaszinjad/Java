package edu.jsp.bi_onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.jsp.bi_onetoone.entity.Car;
import edu.jsp.bi_onetoone.entity.Engine;

public class SearchCar {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_onetoone");
		EntityManager manager=factory.createEntityManager();
		
		Car car = manager.find(Car.class,1);
		Engine engine=car.getEngine();
	}

}
