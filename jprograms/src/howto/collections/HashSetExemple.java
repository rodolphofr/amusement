package howto.collections;

import java.util.HashSet;

public class HashSetExemple {
	
	public static void main(String[] args) {

		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<String> hs2 = new HashSet<String>(); 

		//basic operation
		for (int i = 1; i <= 100; i++) {
			hs1.add(i);
		}
		
		//complex operation
		for (int i = 1; i <= 100; i++) {
			hs2.add("string "+i);
		}

		System.out.println(hs1.toString());
		System.out.println(hs2.toString());
		
	}

}

