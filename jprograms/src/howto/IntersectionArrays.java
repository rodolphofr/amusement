package howto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {
	
	static Integer[] intersection(Integer[] a, Integer[] b) {
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(a));
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(b));
		s1.retainAll(s2);
		return s1.toArray(new Integer[s1.size()]);
	}
	
	public static void main(String[] args) {
		Integer[] a = {5, 6, 9, 8, 4};
		Integer[] b = {0, 1, 2, 3, 4, 5};
		Integer[] intersection = intersection(a, b);
		System.out.println(Arrays.toString(intersection));
	}

}
