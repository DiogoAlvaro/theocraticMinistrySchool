import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tms.constants.StudantGenre;
import com.tms.constants.StudantType;
import com.tms.model.Studant;

public class teste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("theocraticMinistrySchool");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			Studant estudante1 = new Studant();
			estudante1.setName("Diogo Álvaro");
			estudante1.setGenre(StudantGenre.MALE);
			estudante1.setType(StudantType.ELDER);
			estudante1.setActive(true);
			estudante1.setReadingHighlights(true);
			estudante1.setLastHighlights(new Date());
			estudante1.setNumberOne(false);
			estudante1.setNumberTwo(false);
			estudante1.setNumberThree(false);
			
			em.persist(estudante1);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}
		
		System.out.println("It is Over");
	}

}
