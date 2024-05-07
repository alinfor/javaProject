package Correction;

public class Main {
	public static void main(String[] args) {
		Developpeur p = new Developpeur("Liliam Thuriam", 1970, 1800,"Developpeur",4,7);
		System.out.println(p.getNom()+"("+ p.getMetier() +")"+"a une note de" +p.getNote()+"sur 10");
		
		Commercial c = new Commercial ("Yves Le Drian",1985,1500,"Commercial",5,8000);
		System.out.println(c.getNom()+"("+ c.getMetier() +")"+"a gagne " +c.getSalaire()+" euros et a "+c.getCa()+" chiffre d'affaire" );
		
	}
}
