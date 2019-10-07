package com.dev.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.setPrice(40000);
		m1.setName("apple");
		m1.setColor("silver");
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(m1);
            System.out.println("data saved");
	        entityTransaction.commit();
		} catch (Exception e) {

			entityManager.close();
		}

	}

}
