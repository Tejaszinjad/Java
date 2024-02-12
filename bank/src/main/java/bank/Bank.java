package bank;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;

@Entity
public class Bank {
		@Id
		private  int bankid;
		private String name;
		private String address;
		public int getBankid() {
			return bankid;
		}
		public void setBankid(int bankid) {
			this.bankid = bankid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdd() {
			return address;
		}
		public void setAdd(String address) {
			this.address = address;
		}
		
		
		public Bank() {
			super();
		}
		
		
	

}
