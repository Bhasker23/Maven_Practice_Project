package com.connection;

import com.models.Students;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit1");
		
		EntityManager em = emf.createEntityManager();
		
		Students s1 = new Students();
		
		s1.setName("Prakesh");
		s1.setMarks(780);
		
		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("inserting of Student 1 is done...");
	}
}
