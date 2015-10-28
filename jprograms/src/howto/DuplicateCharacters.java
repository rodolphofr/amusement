package howto;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	static void duplicateInAString(String s) {
		char[] array = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : array) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.printf("%s %n", entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		duplicateInAString("Programming");
		duplicateInAString("anna");
	}
}
