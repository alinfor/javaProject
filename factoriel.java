package formations_java;
import java.math.BigInteger;

public class factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(factorielle(10));
		System.out.println(calculeFactorielof(5));
		
	}
	static int factorielle(int nb ) {
		if (nb == 0) {
			return 1;
		}
		return nb *factorielle(nb-1);
	}
	
	static BigInteger calculeFactorielof(int val) {
		BigInteger result = BigInteger.ONE;
//		System.out.println(result);
		for (int i = 2; i <= val; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	}
	

