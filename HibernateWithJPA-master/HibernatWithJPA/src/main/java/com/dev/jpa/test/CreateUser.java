package com.dev.jpa.test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.jpa.beans.User;

public class CreateUser {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Scanner sc = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter the User Id...");
		user.setUserid(sc.nextLine());
		System.out.println("Enter the User Name...");
		user.setUsername(sc.nextLine());
		System.out.println("Enter the User Email...");
		user.setEmail(sc.nextLine());
		System.out.println("Enter the User Password...");
		user.setPassword(sc.nextLine());
		
		
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		sc.close();
		emf.close();

	}

}
