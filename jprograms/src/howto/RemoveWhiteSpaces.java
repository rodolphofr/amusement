package howto;


public class RemoveWhiteSpaces {

	static String remove(String s) {
		return s.replaceAll("\\s", "");
	}
	
	public static void main(String[] args) {
		System.out.println(remove("once upon a time"));
	}
}

