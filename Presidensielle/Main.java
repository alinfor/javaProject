package Presidensielle;

public class Main {

	public static void main(String[] args) {

			
			Election a = new Election();
			
			a.ajouterVotant(new Votant("karim", 20, 2));
			a.ajouterVotant(new Votant("william", 35, 3));
			
			a.enregisterUnVotant("ali",true);
			a.enregisterUnVotant("karim",true);
			a.enregisterUnVotant( "william",false);
			
			a.ListeVotant();
			a.ListeVote();
			System.out.println("Nombre de vote: "+a.ListeVote());
			System.out.println("Nombre de vote Vrai: "+a.resultatTrue());
			System.out.println("Nombre de vote Faux: "+a.resultatFalse());
			


	}

}
