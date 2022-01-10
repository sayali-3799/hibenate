package com.te.hybernet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yashwanth");
		EntityManager em = emf.createEntityManager();
		//multiple data
		String query="from Team";
		Query createQuery = em.createQuery(query);
		List<Team> resultList = createQuery.getResultList();
		for(Team team:resultList) {
			System.out.println(team);
		
		
	}
	
	}

}
