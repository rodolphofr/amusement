package howto;

import java.util.Arrays;

public class SepareteZeroNonZeros {

	static int[] separeteZeros(int[] array) {
		int aux;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] == 0) {
					aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
		int[] t1 = separeteZeros(new int[] { 312, 41, 65, 0, 654, 0, 5, 0, 1, 532, 8, -10 });
		System.out.println(Arrays.toString(t1));
		
		int[] t2 = separeteZeros(new int[] {2, 3, 5, 0, 6, 10, 0, 11});
		System.out.println(Arrays.toString(t2));
	}
}
