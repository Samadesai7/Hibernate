package ui.cts;

import javax.persistence.EntityManager;

import model.cts.ContractEmp;
import model.cts.Employees;
import model.cts.ManagerEmp;
import model.cts.jpa.hib.demo.util.JPAUtil;

public class Example2 {
	public static void main(String args[]) {
		Employees e=new Employees(101,"sweta",2500);
		ManagerEmp m=new ManagerEmp(102,"Ramu",35000,9500);
		ContractEmp ce=new ContractEmp(103,"honey",2500,11);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		System.out.println("all records saved!");
		JPAUtil.shutdown();
		
	}

}
