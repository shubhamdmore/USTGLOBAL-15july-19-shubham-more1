package com.dev.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Read {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            Mobile m = entityManager.find(Mobile.class, 10000);
            System.out.println(m.getPrice());
            System.out.println(m.getName());
            System.out.println(m.getColor());
		} catch (Exception e) {

		
		}

	}

}
