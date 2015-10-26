package howto;

public class SumOfAllDigits {

	public static void main(String[] args) {
		
		int n = 15, sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
