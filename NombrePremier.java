package formations_java;



public class NombrePremier {

	public static void main(String[] args) {
		System.out.println(premier(10));
	}
	public static boolean premier(int n) {
		if( n == 0 || n ==1 ) {
			return false;
		}
		
		for (int i = 2; i < n-1; ) {
			return 	n % i == 0 ?  false : true;
		}
		return false;
	}
		
	}

