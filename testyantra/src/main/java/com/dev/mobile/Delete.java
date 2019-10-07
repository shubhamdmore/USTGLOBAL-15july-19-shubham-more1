package com.dev.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            Mobile m = entityManager.find(Mobile.class, 10000);
            entityManager.remove(m);
            System.out.println("entry deleted ");
            entityTransaction.commit();
            
		} catch (Exception e) {

		entityManager.close();
		}

	}

}
