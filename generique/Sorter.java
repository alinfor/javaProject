package generique;

import java.util.Collections;
import java.util.List;

public class Sorter {
	public static <T extends Comparable <T>> void sortList (List <T>list) {
		Collections.sort(list);
	}
}
