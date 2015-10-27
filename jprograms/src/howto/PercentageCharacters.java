package howto;

public class PercentageCharacters {

	public static void main(String[] args) {

		String s = "I Love You 4Ever++";

		int dg = 0, up = 0, lc = 0, sc = 0;

		char[] array = s.replaceAll("\\s", "").toCharArray();

		for (char c : array) {
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) up++;
				else if (Character.isLowerCase(c)) lc++;
			} else {
				if (Character.isDigit(c)) dg++;
				else sc++;
			}
		}
		
		System.out.printf("Percentage of Uppercase: %.1f %n", ((double) up / array.length) * 100);
		System.out.printf("Percentage of Lowercase: %.1f %n", ((double) lc / array.length) * 100);
		System.out.printf("Percentage of Digits: %.1f %n", ((double) dg / array.length) * 100);
		System.out.printf("Percentage of Special Characters: %.1f ", ((double) sc / array.length) * 100);
		
	}
}
