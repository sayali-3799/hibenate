
package com.te.hybernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
       System.out.println("hello world");
       Team player = new Team();
       player.setId(1);
       player.setName("Ms Dhoni");
       player.setSalary(10000);
       player.setDesignation("Captian");
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("yashwanth");
       EntityManager em = emf.createEntityManager();
       EntityTransaction transaction = em.getTransaction();
       transaction.begin();
       em.persist(player);
       
       transaction.commit();
       
       
       
    }
}
