package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hybernet.Team;

public class Update {

	public static void main(String[] args) {
		System.out.println("hello");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yashwanth");
		EntityManager em = emf.createEntityManager();
		Team player = em.find(Team.class, 1);
		System.out.println(player);
		Team reference = em.getReference(Team.class, 2);
		System.out.println(reference);
		EntityTransaction transaction = em.getTransaction();
		
		//deleting the data
		
		transaction.begin();
		em.remove(player);
		transaction.commit();
		
		//updating the data
		
		Team k1 = em.find(Team.class, 2);
		if(k1!=null) {
			k1.setDesignation("Baller");
			transaction.begin();
			transaction.commit();
			System.out.println("updated");
			
		}
		
		

	}

}
