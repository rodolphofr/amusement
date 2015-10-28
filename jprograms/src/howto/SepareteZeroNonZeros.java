package howto;

import java.util.Arrays;

public class SepareteZeroNonZeros {

	public static void main(String[] args) {
		
		int[] a = {312, 41, 65, 0, 654, 0, 5, 0, 1, 532, 8, -10};
		
		int aux;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] == 0) {
					aux = a[j];
					a[j] = a[i];
					a[i] = aux;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
