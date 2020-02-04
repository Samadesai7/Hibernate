package ui.cts;



import java.sql.Date;

import javax.persistence.EntityManager;

import model.cts.Student;
import model.cts.StudentIdentity;
import model.cts.jpa.hib.demo.util.JPAUtil;

public class Example1ForComposition {
	public static void main(String args[]) {
		Student s=new Student(new StudentIdentity(1,'A',7),"Sama","Darshini",new Date(2020,02,02));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Student saved!");
		JPAUtil.shutdown();
	}

}
