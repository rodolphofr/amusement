package howto;

import java.util.Arrays;

public class EqualiyArrays {
	
	public static void main(String[] args) {
		
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = {1, 2, 3, 4, 5};
		int[] a3 = {2, 1, 4, 3, 5};
		
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.equals(a2, a3));
		System.out.println(Arrays.equals(a1, a3));
			
	}

}
