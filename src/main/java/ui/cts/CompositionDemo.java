package ui.cts;
import javax.persistence.EntityManager;

import model.cts.Address;
import model.cts.Faculty;
import model.cts.jpa.hib.demo.util.JPAUtil;

public class CompositionDemo {
	public static void main(String args[]) {
		Faculty f=new Faculty("Vani",
				new Address("A201","Serling Brooke field","Banglore,karnataka"));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		//em.flush();
		System.out.println("faculty saved!");
		JPAUtil.shutdown();
	}

}
