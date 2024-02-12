package Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUser {
		
		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			Users users = manager.find(Users.class, 5);
			
			if (users!=null) {
				transaction.begin();
			    manager.remove(users);
			    transaction.commit();
			    System.out.println("-----------------------------------");
			    System.out.println("User Deleted..");
			} else {
				System.out.println("User Not Found..");
			}

		}

}
