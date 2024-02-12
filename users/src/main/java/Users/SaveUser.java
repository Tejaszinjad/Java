package Users;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class SaveUser {
	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("users");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	Users users = new Users();
	
	System.out.println("-----------------------------------------------");
	transaction.begin();
	users.setUserID(5);
	users.setName("Arslan");
	users.setEmail("arslan@gmail.com");
	users.setDob(LocalDate.of(2003, 3, 17));
	manager.persist(users);
	transaction.commit();
	System.out.println("User Saved...");
	}
}





