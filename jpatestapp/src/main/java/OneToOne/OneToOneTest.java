package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneTest {

	public static void main(String[] args) {

		Person p = new Person();
		p.setId(700);
		p.setName("shubham");
		p.setEmail("shubham321@gmail.com");

		VoterCard vc = new VoterCard();
		vc.setVid(800);
		vc.setName("shubham");

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			// entityManager.persist(p);
			// entityManager.persist(vc);
			VoterCard voterCard = entityManager.find(VoterCard.class, 800);
			// voterCard.getPerson().
			System.out.println("saved");
			entityTransaction.commit();

		} catch (Exception e) {

			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
