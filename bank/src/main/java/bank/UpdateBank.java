package bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBank {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = manager.find(Bank.class, 1);
		if (bank!=null) {
			transaction.begin();
			manager.merge(bank);
			bank.setName("AXIS");
			bank.setAdd("Dubai");
			transaction.commit();
			System.out.println("-----------------------------");
			System.out.println("Bank Updated...");
			
		} else {
			System.out.println("Bank NOt Found..");
		}
		

	}


}
