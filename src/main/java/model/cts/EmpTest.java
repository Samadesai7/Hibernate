package model.cts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpTest {
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Emp e=new Emp();
		e.setEname("sama");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("inserted..............");
	}

}
