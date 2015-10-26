package howto;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "alegria";
		String b = "regalia";

		if (areAnagram(a, b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean areAnagram(String a, String b) {
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

}
