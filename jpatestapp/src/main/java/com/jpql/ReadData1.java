package com.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.Movie;

public class ReadData1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		String jpql = "select name from Movie";
		Query query = entityManager.createQuery(jpql);

		List<String> reList = query.getResultList();
		for (String st : reList) {
		
			System.out.println(st);
		}

	}

}
