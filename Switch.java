package formations_java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Donner un nombre:");
		try (Scanner clavier = new Scanner (System.in)) {
			int nb = clavier.nextInt();
			switch (nb) {
			case 1: System.out.println("lundi");break;
			case 2: System.out.println("mardi");break;
			case 3: System.out.println("mercredi");break;
			default: System.out.println("autrement"); break;
			}
		}
	}

}
