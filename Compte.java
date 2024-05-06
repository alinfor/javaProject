package formations_java;

public class Compte {
	private int code;
	protected float solde;
	
	public Compte(int c,float s) {
		code = c;
		solde = s;
	}
	
	public void verser(float mt) {
		solde+=mt;
	}
	public void retier(float mt) {
		solde-=mt;
	}
	public String toString() {
		return ("Code= "+code +" Solde="+solde);
	}
}
