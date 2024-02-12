package Users;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUser {
		
		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("users");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			Users users = manager.find(Users.class, 1);
			if (users!=null) {
				transaction.begin();
				manager.merge(users);
				users.setName("Shubham");
				users.setEmail("shubhamggmail.com");
				users.setDob(LocalDate.of(2000, 2, 05));
				transaction.commit();
				System.out.println("-----------------------------");
				System.out.println("User Updated...");
				
			} else {
				System.out.println("User NOt Found..");
			}
			

		}

}
