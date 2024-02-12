package edu.jsp.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.hibernateProj.Employee;
import edu.jsp.hibernateProj.Task;

public class Controller {
	
	public Employee addemp(Employee e) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();

			manager.persist(e);

			transaction.commit();
			return e;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public Employee removeemp(int id) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();

			Employee e = manager.find(Employee.class, id);
			manager.remove(e);

			transaction.commit();
			return e;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public Employee searchemp(int id) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();

			Employee e = manager.find(Employee.class, id);

			return e;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public List<Employee> getallemp() {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			String sql = "select s from employee s";
			Query query = manager.createQuery(sql);

			List<Employee> emplist = (List<Employee>) query.getResultList();
			if (!emplist.isEmpty()) {
				return emplist;
			} else {
				System.out.println("list is empty");
				return null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	public boolean addtask(Task t) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();

			manager.persist(t);

			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean removetask(int id) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();

			Task t = manager.find(Task.class, id);
			manager.remove(t);

			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public Task  searchtask(int id) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();

			Task t = manager.find(Task.class, id);

			return t;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public List<Task> getalltask() {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			String sql = "select s from task s";
			Query query = manager.createQuery(sql);

			List<Task> tasklist = (List<Task>) query.getResultList();
			if (!tasklist.isEmpty()) {
				return tasklist;
			} else {
				System.out.println("list is empty");
				return null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	public boolean assigntask(int empid, int taskid) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateProj");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			Employee e = manager.find(Employee.class, empid);
			Task t = manager.find(Task.class, taskid);

			e.setTasks(Arrays.asList(t));
			t.setEmployees(Arrays.asList(e));

			transaction.begin();
			manager.merge(e);
			manager.merge(t);

			transaction.commit();

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}
	
	public static void main(String[] args) {
		Controller c= new Controller();
		
		
		Employee emp=new Employee();
//		emp.setAge(22);
//		emp.setDoj(LocalDate.of(2023,2, 23));
//		emp.setName("Tejas");
//		emp.setSalary(100000);
//		c.addemp(emp);
//		System.out.println(c.searchemp(1).getAge());
//		
//		
//		
//		Task t = new Task();
//		t.setStartdate(LocalDate.of(2024, 02, 10));
//		t.setName("Sorting");
//		t.setDeadline(LocalDate.of(2024, 02, 15));
		c.removetask(107);
		
	}

}


