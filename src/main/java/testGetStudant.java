import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tms.model.Studant;

public class testGetStudant {

	public static void main(String[] args) {
		
		List<Studant> estudantes;
		
		//Criando a Fábrica de Pesistencia no BD
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("theocraticMinistrySchool");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			TypedQuery<Studant> query = em.createQuery("FROM Studant WHERE name='Diogo Álvaro'", Studant.class);
			estudantes = query.getResultList();
			
			for (Studant estudante : estudantes){
				System.out.println("Nome: "+ estudante.getName());
				System.out.println("Gênero: "+ estudante.getGenre());
				System.out.println("tipo: "+ estudante.getType());
				System.out.println("Ativo: "+ estudante.getActive());
				System.out.println("Destaques: "+ estudante.getReadingHighlights());
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			emf.close();
		}
		
	}
}
