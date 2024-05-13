package generique;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> inList = Arrays.asList(5,3,9,1);
		Sorter.sortList(inList);
		System.out.println(inList);
		List<String> stringList = Arrays.asList("zahir","mike","baba","karim","ali");
		Sorter.sortList(stringList);
		System.out.println(stringList);
	}
}
