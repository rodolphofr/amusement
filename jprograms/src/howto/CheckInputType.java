package howto;

import java.util.Scanner;

public class CheckInputType {
	
	static boolean isNumber(String s) {
		return s.matches("^[0-9]+$");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		String result = isNumber(input) ? "eh numero" : "nao eh numero";
		
		System.out.println(result);
		
		sc.close();
		
	}

}
