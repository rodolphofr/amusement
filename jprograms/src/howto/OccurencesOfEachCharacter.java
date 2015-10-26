package howto;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfEachCharacter {

	public static void main(String[] args) {
		
		String s = "I love ice cream";
		
		//despising capital letters
		occurescesOfChars(s, false);
	}
	
	public static void occurescesOfChars(String s, boolean sensitiveCase) {
		if (!sensitiveCase) s = s.toLowerCase();
		
		char[] characters = s.replaceAll("\\s", "").toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : characters) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.printf("%s = %d %n", entry.getKey(), entry.getValue());
		}
 	}
	
}
