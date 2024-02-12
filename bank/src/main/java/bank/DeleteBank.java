package bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBank {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = manager.find(Bank.class, 5);
		
		if (bank!=null) {
			transaction.begin();
		    manager.remove(bank);
		    transaction.commit();
		    System.out.println("-----------------------------------");
		    System.out.println("Bank Deleted..");
		} else {
			System.out.println("Bank Not Found..");
		}

	}

}


