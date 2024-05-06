package formations_java;

public class Main {

	public static void main(String[] args) {
		Livre a = new Livre("Guy de Maupassant", "Bel-Ami", 1885);
		a.afficherDetail();
		Bibliotheque b = new Bibliotheque();
		b.ajouterLivre(a);
		
		b.affiche();
		
		
//		Compte compte = new Compte(1,5000);
//		Compte compte2 = new Compte(1,5000);
//		
//		compte.verser(155555);
//		compte2.verser(155555);
//		
//		System.out.println(compte.toString());
	
	}

}
