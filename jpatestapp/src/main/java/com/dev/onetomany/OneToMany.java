package com.dev.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToMany {

	public static void main(String[] args) {

		Pen p1 = new Pen();
		p1.setId(100);
		p1.setName("abc");
		
		Pen p2= new Pen();
		p2.setId(200);
		p2.setName("xyz");
		
		ArrayList<Pen> ap = new ArrayList<Pen>();
		ap.add(p1);
		ap.add(p2);
		
		
		EntityManagerFactory emf=null;
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			System.out.println("unidirectional");
		//	em.persist();
			System.out.println("saved");
			em.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally
		{
			em.close();
		}
	}
}
