package formations_java;

public class Boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab =new int [] {1,2,4,6,39,5};
		for (int i = 0; i < tab.length; i++) {
			String resultat = (i == 5) ? "ya un 5" : "pas de 5";
			System.out.println(resultat);
		}
	}

}
