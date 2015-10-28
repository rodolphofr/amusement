package howto;

public class StringReverseWithSpaces {
	
	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Programming is fun"));
		System.out.println(reverse("Reverse the string with preserving the position of spaces"));
	}

}
