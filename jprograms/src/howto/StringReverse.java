package howto;

public class StringReverse {
	
	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Reverse"));
		System.out.println(reverse("Rodolpho"));
	}
	
}
