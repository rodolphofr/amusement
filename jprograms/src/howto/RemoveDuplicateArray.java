package howto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateArray {

	static Integer[] removeDuplicate(Integer[] array) {
		int index = 0;
		
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(array));
		Integer[] newArray = new Integer[hashSet.size()];
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			newArray[index] = iterator.next();
			index++;
		}
		
		return newArray;
	}

	public static void main(String[] args) {
		Integer[] t1 = { 1, 2, 2, 3, 1, 2, 5 };
		System.out.println(Arrays.toString(removeDuplicate(t1)));
		Integer[] t2 = { 44, 100, 12, 6, 9, 100, 44};
		System.out.println(Arrays.toString(removeDuplicate(t2)));
	}
}
