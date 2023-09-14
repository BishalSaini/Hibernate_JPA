package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vishu"); //It will take the Info from persistence file
		EntityManager entityManager= entityManagerFactory.createEntityManager();// It has all the methods to perform db operations 
		EntityTransaction entityTransaction=entityManager.getTransaction();//It is a key that tells when to start and when to stop 
		
		Employee employee=new Employee(); 
		employee.setName("ViShu"); 
		employee.setEmail("vishu@mail"); 
		employee.setCno(860660888); 
		
		entityTransaction.begin(); 
		entityManager.persist(employee); 
		entityTransaction.commit();//commit means Action needs to be /perform
	}
}
