package formations_java;

import java.util.Scanner;

public class ReadInteger {

	public static void main(String[] args) {

		Scanner scanner  = new Scanner(System.in);
		System.out.println("Entre un entier : ");
		int nombre  =scanner.nextInt();
		System.out.println("L'entier saisi est :" +nombre);
		
		scanner.close();
	}

}
