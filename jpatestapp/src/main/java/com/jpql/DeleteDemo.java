package com.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//String jpql = "delete from Movie where id=200 ";
			 String jpql = "update Movie set name=:nm where id=:id";
			 
			Query query = entityManager.createQuery(jpql);
			query.setParameter("nm", "chichore");
			query.setParameter("id", 400);
			int reList = query.executeUpdate();
			System.out.println("query deleted" + reList);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
