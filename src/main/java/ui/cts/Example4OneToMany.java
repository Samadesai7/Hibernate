package ui.cts;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.cts.Course;
import model.cts.Trainee;
import model.cts.jpa.hib.demo.util.JPAUtil;

public class Example4OneToMany {
	public static void main(String args[]) {
		Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
		mca.getTrainees().add(new Trainee(201,"sarayu",mca));
		mca.getTrainees().add(new Trainee(202,"sarah",mca));
		mca.getTrainees().add(new Trainee(203,"akhil",mca));
		mba.getTrainees().add(new Trainee(204,"indra",mba));
		mba.getTrainees().add(new Trainee(205,"lalli",mba));
		mba.getTrainees().add(new Trainee(206,"priya",mba));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
	}

}
