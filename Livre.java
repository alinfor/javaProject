package formations_java;

public class Livre {

	private String Titre;
	private String Auteur;
	private int  Apublication;
	
	public String getTitre() {
		return Titre;
	}


	public void setTitre(String titre) {
		Titre = titre;
	}


	public String getAuteur() {
		return Auteur;
	}


	public void setAuteur(String auteur) {
		Auteur = auteur;
	}


	public int getApublication() {
		return Apublication;
	}


	public void setApublication(int apublication) {
		Apublication = apublication;
	}

	Livre(String titre, String auteur, int Apublication){
		this.Apublication =Apublication;
		this.Auteur =auteur;
		this.Titre = titre;
	}
	
	public void afficherDetail() {
		System.out.println("Le detail du livre a pour titre: "+this.Titre+ " qui a ete ecrit par "+this.Auteur +"a l'année "+this.Apublication);
	}

}
