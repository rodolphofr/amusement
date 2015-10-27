package howto;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		/* Reverse and Add until you get a palindrome */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String s = sc.nextLine();
			String reverse = new StringBuilder(s).reverse().toString(); 
			
			if (s.equals(reverse)) {
				System.out.println(s + " is Palindrome");
				break;
			}
			
		}
		
		sc.close();
		
	}
	
	
}
