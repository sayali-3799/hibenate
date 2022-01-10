package com.te.hybernet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DemoJpql {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yashwanth");
		EntityManager em = emf.createEntityManager();
		  String query="from Team where designation='Baller'";
		  Query createQuery = em.createQuery(query);
		  List<Team> resultList = createQuery.getResultList();
		  for(Team team:resultList) {
			  System.out.println(team);
		  }
		 
		  //min salary
		  
		  String query1="Select min(salary) from Team";
		  Query createQuery2 = em.createQuery(query1);
		  Double singleResult = (Double)createQuery2.getSingleResult();
		  System.out.println(singleResult);
		 
		  //update
		  
		  EntityTransaction transaction = em.getTransaction();
		  String query2="update Team set salary=150 where id=3";
		  transaction.begin();
		   Query createQuery3 = em.createQuery(query2);
		   int executeUpdate = createQuery3.executeUpdate();
		   transaction.commit();
		   
		   //delete
		   
		   EntityTransaction transaction2 = em.getTransaction();
		   String query4="delete from Team where id=3";
		   transaction2.begin();
		   Query createQuery4 = em.createQuery(query4);
		   int executeUpdate2 = createQuery4.executeUpdate();
		   transaction2.commit();
		   
		  
		   //dynamic queries
		   
		   EntityTransaction transaction1 = em.getTransaction();
			  String query21="update Team set salary=:sal where id=:od";
			  transaction1.begin();
			   Query createQuery31 = em.createQuery(query21);
			   createQuery31.setParameter("sal", 320.0);
			   createQuery31.setParameter("od", 4);
                int executeUpdate3 = createQuery31.executeUpdate();
			   transaction1.commit();
		   
		   
		   

	}

}
