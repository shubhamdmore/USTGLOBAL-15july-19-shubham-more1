package com.dev.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToMany {

	public static void main(String[] args) {

		Course course = new Course();
		course.setCid(10);
		course.setCname("java");

		Course course1 = new Course();
		course1.setCid(10);
		course1.setCname("java");

		ArrayList<Course> li = new ArrayList<Course>();
		li.add(course);
		li.add(course1);

		Student st = new Student();
		st.setSid(100);
		st.setSname("shubham");

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

		} catch (Exception e) {

		}

	}

}
