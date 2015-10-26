package howto;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsArray {

	public static void main(String[] args) {

		int[] arrA = { 1, 2, 3, 1, 3, 5 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : arrA) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.println(entry.getKey());
			}
		}

	}
}
