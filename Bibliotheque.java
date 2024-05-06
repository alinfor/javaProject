package formations_java;

public class Bibliotheque {
	Livre livre;
	
	public void ajouterLivre (Livre liv) {
		this.livre =liv; 
	}
	
	public void affiche () {
		System.out.println("Bibiotheque");
		livre.afficherDetail();
	}
}
