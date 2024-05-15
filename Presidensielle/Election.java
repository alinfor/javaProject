package Presidensielle;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map.Entry;

public class Election {
	private List<Votant> votants = new ArrayList<>();
	private HashMap<String, Boolean> sauvegardeVote = new HashMap<>();
	private HashMap<Integer,Boolean> resultatVote = new HashMap<>();
	
	public void ajouterVotant(Votant votant) {
		votants.add(votant);
	}
	
	public void enregisterUnVotant(  String nom,Boolean vote) {
		sauvegardeVote.put( nom,vote);
	}
	
	public void enregistrerVoteResultat(Integer IdVotant, Boolean vote){
		resultatVote.put(IdVotant, vote);
	}

	public void ListeVotant() {
		for (Votant votant : votants) {
			System.out.println("Le "+votant.name()+" a vote. Age: "+votant.age()+"ans.");
		}
	}
	public int ListeVote() {
		int totalVote =0;
		for (Entry<String, Boolean> e : sauvegardeVote.entrySet()) {
			System.out.println(e.getKey()+" a vote " + e.getValue());
			totalVote++;
		}
		return totalVote;
	}
	
	
	public int resultatTrue() {
		int v= 0;
		for (Entry<String, Boolean> e : sauvegardeVote.entrySet()) {
			if(e.getValue() == true) {
				v++;
			}
		}
		return v;		
	}
	
	public int resultatFalse() {
		int f= 0;
		for (Entry<String, Boolean> e : sauvegardeVote.entrySet()) {
			if(e.getValue() == true) {
				f++;
			}
		}
		return f;		
	}
}
