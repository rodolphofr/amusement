package howto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber<T> {

	static double secondLargest(Double[] array) {
		List<Double> list = Arrays.asList(array);
		Collections.sort(list, Collections.reverseOrder());
		return list.get(1);
	}

	public static void main(String[] args) {
		Double[] t1 = { 31.31, 131.65, 54.551, 432.32, 6.0, 4256.99, 98.1, 23.2 };
		System.out.println(secondLargest(t1));
		
		Double[] t2 = {6.2, 9.5, 0.0, 4.4};
		System.out.println(secondLargest(t2));
	}
}
