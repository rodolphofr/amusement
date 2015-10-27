package howto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecondLargestNumber {

	public static void main(String[] args) {

		Double[] arr = { 31.31, 131.65, 54.551, 432.32, 6.0, 4256.99, 98.1, 23.2 };
		
		List<Double> list = Arrays.asList(arr);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list.get(1));
		
	}
}
