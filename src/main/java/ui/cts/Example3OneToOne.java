package ui.cts;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.cts.BankAccount;
import model.cts.Customer;
import model.cts.jpa.hib.demo.util.JPAUtil;

public class Example3OneToOne {
	public static void main(String args[]) {
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("885525253","sundar",ba);
		ba.setAccno("CNRB01");
		ba.setCustomer(cs);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txm=em.getTransaction();
		txm.begin();
		em.persist(cs);
		txm.commit();
		JPAUtil.shutdown();
	}

}
