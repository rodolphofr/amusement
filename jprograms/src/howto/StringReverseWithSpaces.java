package howto;

public class StringReverseWithSpaces {
	
	public static void main(String[] args) {
		
		String s = "Reverse the string with preserving the position of spaces";
		
		System.out.println(new StringBuilder(s).reverse());
		
	}

}
