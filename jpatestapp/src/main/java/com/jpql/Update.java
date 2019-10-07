package com.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "update Movie set name='rhtdm' where id=200 ";
			Query query = entityManager.createQuery(jpql);
			int reList = query.executeUpdate();
			System.out.println("query updated" + reList);
			transaction.commit();
		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();
		}

	}

}
