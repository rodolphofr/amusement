package howto;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalindrome(String s1) {
		return s1.equals(new StringBuilder(s1).reverse().toString());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String s = sc.nextLine();
			if (isPalindrome(s)) {
				System.out.println("eh palindrome");
				break;
			}
		}
		
		sc.close();
		
	}
	
	
}
