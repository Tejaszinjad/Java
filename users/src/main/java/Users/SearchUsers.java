package Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Users.Users;

public class SearchUsers {
	
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("users");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Users users = manager.find(Users.class, 1);
		if (users != null)  {
			
		
			System.out.println("-----------------------------");
			System.out.println("User ID: "+users.getUserID());
			System.out.println("User Name: "+users.getName());
			System.out.println("User Email: "+users.getEmail());
			System.out.println("User DOB: "+users.getDob());
			System.out.println("User Found");
		} else {
			System.out.println("User Not Found");
		}		

	}

}
