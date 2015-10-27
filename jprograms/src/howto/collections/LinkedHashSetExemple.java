package howto.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExemple {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();
		
		for (int i = 1; i <= 100; i++) {
			lhs1.add(i);
		}
		
		for (int i = 1; i <= 100; i++) {
			lhs2.add("string "+i);
		}

		for (Integer i : lhs1) {
			System.out.println(i);
		}
		
		System.out.println("==============");
		
		//performative and maintains ordering
		for (String s : lhs2) {
			System.out.println(s);
		}
	}
}
