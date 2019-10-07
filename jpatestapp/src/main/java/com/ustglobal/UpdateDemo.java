package com.ustglobal;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		EntityManager entityManage = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManage = entityManagerFactory.createEntityManager();
			transaction = entityManage.getTransaction();
			transaction.begin();
			Movie movie = entityManage.find(Movie.class, 200);
			movie.setName("chichore");
			System.out.println("update...");
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManage.close();
		}
	}// end of main method

}
