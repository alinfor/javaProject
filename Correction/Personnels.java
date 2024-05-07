package Correction;

public class Personnels {
	private String nom;
	private int annee;
	private float salaireM;
	private String metier;
	public Personnels(String nom, int annee, float salaireM, String metier) {
		this.nom = nom;
		this.annee = annee;
		this.salaireM = salaireM;
		this.metier =metier;
	}
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	public float getSalaire() {
		return salaireM;
	}
	public float getSalaireM() {
		return salaireM;
	}
	public void setSalaireM(float salaireM) {
		this.salaireM = salaireM;
	}
	public void setSalaire(float salaire) {
		this.salaireM = salaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
