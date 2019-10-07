package com.ustglobal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Movie movie = new Movie();
		movie.setId(400);
		movie.setName("abcd");
		movie.setRating("best");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");// provid
																												// all

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("saved");
			transaction.commit();// if we not write transaction.commite() then object is not saved in database

		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			e.printStackTrace();

		} finally {
			entityManager.close();
		}

	}
}
