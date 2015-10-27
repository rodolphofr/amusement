package howto;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s = "Java";
		
		s.toUpperCase();
		
		System.out.println(s);
		
		s = s.toUpperCase();
		
		System.out.println(s);
		
	}
}
