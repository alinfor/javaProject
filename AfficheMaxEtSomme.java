package formations_java;


import java.util.Scanner;

public class AfficheMaxEtSomme {

		int nbr1;
		int nbr2;
		Scanner scanner  = new Scanner(System.in);
		
		public int getNbr1() {
			System.out.println("Entre un entier nbr1 : ");
			this.nbr1 = scanner.nextInt();
			System.out.println("nbr1 : "+nbr1);
			return nbr1;
		}
		public void setNbr1(int nbr1) {
			this.nbr1 = nbr1;
		}
		public int getNbr2() {
			System.out.println("Entre un entier nbr2 : ");
			this.nbr2= scanner.nextInt();
			System.out.println("nbr2 : "+nbr2);
			return nbr2;
		}
		public void setNbr2(int nbr2) {
			this.nbr2 = nbr2;
		}
		
		


}
