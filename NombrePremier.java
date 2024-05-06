package formations_java;



public class NombrePremier {

	public static void main(String[] args) {
		premier(3);
		
	}
	public static boolean premier(int n) {
		if( n == 0 || n ==1 ) {
			return false;
		}
		return n ==0 
		for (int i = 2; i < n-1 ; i++) {
			return 	n % i == 0 ?  false : true;
		}
	}
		
	}

