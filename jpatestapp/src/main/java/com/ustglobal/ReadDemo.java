package com.ustglobal;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EntityManager entityManager = null;
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();

		Movie data = entityManager.find(Movie.class, 100);
		System.out.println(data.getId());
		System.out.println(data.getName());
		System.out.println(data.getRating());
		entityManager.close();
	}

}
