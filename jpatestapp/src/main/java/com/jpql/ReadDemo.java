package com.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		String jpql = "from Movie";
		Query query = entityManager.createQuery(jpql);

		List<Movie> reList = query.getResultList();
		for (Movie movie : reList) {
			System.out.print(movie.getName());
			System.out.print(movie.getId());
			System.out.print(movie.getRating());
			System.out.println();
		}

	}

}
