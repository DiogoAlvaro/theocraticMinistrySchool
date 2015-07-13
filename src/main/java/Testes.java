import com.tms.constants.StudantGenre;

public class Testes {
	
	public static StudantGenre[] getStudantGenres() {
		return StudantGenre.values();
	}
	
	public static void main(String[] args) {
		
		StudantGenre[] genres = getStudantGenres();
		
		System.out.println(genres[0]);
		
	}

}
