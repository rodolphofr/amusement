package howto;


public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "once upon a time";
		
		s = s.replaceAll("\\s", "");
		
		System.out.println(s);
		
	}
}

