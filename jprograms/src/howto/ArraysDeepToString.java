package howto;

import java.util.Arrays;
import java.util.Random;

public class ArraysDeepToString {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int [][] m = new int[5][5];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(1000);
			}
		}
		
		System.out.println(Arrays.deepToString(m));
	}

}

