package howto;

import java.util.Arrays;

public class Anagram {
	
	static boolean areAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			char[] arrA = a.toLowerCase().toCharArray();
			char[] arrB = b.toLowerCase().toCharArray();

			Arrays.sort(arrA);
			Arrays.sort(arrB);

			if (Arrays.equals(arrA, arrB)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(areAnagram("alegria", "regalia"));
		System.out.println(areAnagram("roma", "Amor"));
		System.out.println(areAnagram("heart", "earth"));
		System.out.println(areAnagram("cara", "arco"));
	}

	

}
