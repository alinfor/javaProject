package formations_java;

public class Bibliotheque {
	Livre livre;
	
	public void ajouterLivre (Livre livre) {
		this.livre =livre; 
	}
	
	public void affiche () {
		System.out.println("Bibiotheque");
		livre.afficherDetail();
	}
}
