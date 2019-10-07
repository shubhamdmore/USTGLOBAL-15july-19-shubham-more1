package com.project;

import com.project.HotelBill;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MethodImplementation implements Methods {

	Scanner sc = new Scanner(System.in);

	public void showAllItems() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		HotelBill hb1 = new HotelBill();

		String jpql = "select foodname from HotelBill";
		Query query = entityManager.createQuery(jpql);

		List<String> reList = query.getResultList();
		for (String st : reList) {

			System.out.println(st);
		}

	}

	public void takeOrder() {

		System.out.println("enter your order enter itemcode");
		int ic = sc.nextInt();
		if (ic == 100)
			System.out.println("your bill is 50 for dosa");
		else if (ic == 200)
			System.out.println("your bill is 150 for kabab");
		else if (ic == 300)
			System.out.println("your bill is 200 for chikan");
		else if (ic == 400)
			System.out.println("your bill is 300 for xyz");
		else if (ic == 500)
			System.out.println("your bill is 500 for abc");
		else
			System.out.println("enter valid code");

	}

	public void addItems() {

		HotelBill hb = new HotelBill();

		hb.setItemcode(600);
		hb.setFoodname("panipuri");
		hb.setPrice(40);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			entityManager.persist(hb);
			System.out.println("item saved succsessfully");
			entityTransaction.commit();

		} catch (Exception e) {

			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

	public void remove() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			HotelBill hb1 = entityManager.find(HotelBill.class, 100);
			entityManager.remove(hb1);
			System.out.println("record deleted");
			entityTransaction.commit();

		} catch (Exception e) {

			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

	public void modify() {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "update HotelBill set foodname='kabab' where id=200 ";
			Query query = entityManager.createQuery(jpql);
			int reList = query.executeUpdate();
			System.out.println("query updated" + reList);
			transaction.commit();
		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();
		}

	}

	public void totalBill() {

		System.out.println("enter your order enter itemcode");
		int ic = sc.nextInt();
		if (ic == 100)
			System.out.println("your total bill of the day 50 ");
		else if (ic == 200)
			System.out.println("your total bill of the day 150");
		else if (ic == 300)
			System.out.println("your total bill of the day 200");
		else if (ic == 400)
			System.out.println("your total bill of the day 300");
		else if (ic == 500)
			System.out.println("your total bill of the day 500");
		else
			System.out.println("enter valid code");

	}
}
