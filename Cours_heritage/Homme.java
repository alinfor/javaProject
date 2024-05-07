package Cours_heritage;

public class Homme extends Personnes{

	private String genre;

	public Homme(String nom, String prenom, int age, String genre) {
		super(nom, prenom, age);
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
