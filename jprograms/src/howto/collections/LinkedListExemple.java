package howto.collections;

import java.util.LinkedList;

public class LinkedListExemple {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		for (int i = 100; i >= 0; i--) {
			linkedList.add(i);
		}
		
		System.out.println(linkedList.toString());
		
	}

}
