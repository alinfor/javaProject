package Correction;

public class Developpeur extends Personnels {
	private int nbreApi;
	private float note;
	
	public Developpeur(String nom, int annee, float salaireM,String metier, int nbreApi, float note ) {
		super(nom, annee, salaireM, metier);
		this.nbreApi = nbreApi;
		this.note = note;
	}

	public int getNbreApi() {
		return nbreApi;
	}

	public void setNbreApi(int nbreApi) {
		this.nbreApi = nbreApi;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}


}
