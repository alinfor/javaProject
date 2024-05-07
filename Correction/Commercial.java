package Correction;

public class Commercial extends Personnels {
	
	int nbrClient;
	float ca;
	public Commercial(String nom, int annee, float salaireM, String metier, int nbrClient, float ca) {
		super(nom, annee, salaireM, metier);
		this.nbrClient = nbrClient;
		this.ca = ca;
	}
	public int getNbrClient() {
		return nbrClient;
	}
	public void setNbrClient(int nbrClient) {
		this.nbrClient = nbrClient;
	}
	public float getCa() {
		return ca;
	}
	public void setCa(float ca) {
		this.ca = ca;
	}


}
