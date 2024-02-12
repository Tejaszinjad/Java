package bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SearchBank {
	
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = manager.find(Bank.class, 1);
		if (bank != null)  {
			
		
			System.out.println("-----------------------------");
			System.out.println("BankID: "+bank.getBankid());
			System.out.println("Bank Name: "+bank.getName());
			System.out.println("Bank Address: "+bank.getAdd());
			System.out.println("Bank Found");
		} else {
			System.out.println("Bank Not Found");
		}		

	}

}


