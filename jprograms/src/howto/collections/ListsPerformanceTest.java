package howto.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsPerformanceTest {
	
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		//start add arraylist
		long start = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			arrayList.add(i);
		}
		
		long end = System.nanoTime();
		System.out.println("ArraysList add: " + (end -  start));

		
		//start add linkedlist
		start = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			linkedList.add(i);
		}
		
		end = System.nanoTime();
		System.out.println("LinkedList add: " + (end -  start));
		
		
		//start get arraylist
		start = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}

		end = System.nanoTime();
		System.out.println("ArrayList get: " +  (end - start));

		
		//start get linkedlist
		start = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		
		end = System.nanoTime();
		System.out.println("LinkedList get: " + (end - start));

		
		//start remove arraylist
		start = System.nanoTime();
		
		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		
		end = System.nanoTime();
		System.out.println("ArrayList remove: " +  (end - start));

		//start remove linkedlist
		start = System.nanoTime();
		
		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}

		end = System.nanoTime();
		System.out.println("LinkedList remove: " + (end - start));

	}

}