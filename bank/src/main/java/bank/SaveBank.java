package bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBank {
	
public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = new Bank();
		
		
			System.out.println("-----------------------------------------------");
			transaction.begin();
			bank.setBankid(2);
			bank.setName("SBI");
			bank.setAdd("Nerul");
			manager.persist(bank);
			transaction.commit();
			System.out.println("Bank Saved...");
			
		
       }

	}


