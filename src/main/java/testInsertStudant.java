import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tms.constants.StudantGenre;
import com.tms.constants.StudantType;
import com.tms.model.Studant;

public class testInsertStudant {

	//Conversor de String para Date
	public static Date converterStringForDate(String string){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(string, formatter);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println(date); // 2010-01-02
		return date;
	}
	
	
	
	public static void main(String[] args) {
		//Criando a Fábrica de Pesistencia no BD
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("theocraticMinistrySchool");
		EntityManager em = emf.createEntityManager();
		
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
		
		Studant estudante2 = new Studant();
		estudante2.setName("Denise Ferreira Bezerra");
		estudante2.setGenre(StudantGenre.FEMALE);
		estudante2.setType(StudantType.PUBLISHER);
		estudante2.setActive(true);
		estudante2.setReadingHighlights(false);
		//estudante1.setLastHighlights();
		estudante2.setNumberOne(false);
		estudante2.setNumberTwo(true);
		estudante2.setLastNumberTwo(converterStringForDate("09/07/2015"));
		estudante1.setNumberThree(true);
		
		try {
			em.getTransaction().begin();
			em.persist(estudante1);
			em.persist(estudante2);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}
		
		
	}

}
