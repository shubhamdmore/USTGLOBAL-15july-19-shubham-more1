package com.ustglobal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 100);
			entityManager.remove(movie);
			System.out.println("record deleted");
			
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			entityManager.close();
		}
	}// end of main method

}
