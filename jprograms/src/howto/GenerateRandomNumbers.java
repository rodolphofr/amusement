package howto;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
			
		Random random = new Random();
		
		int in = random.nextInt();
		System.out.println("Integer number: " + in);
		
		double dn = random.nextDouble();
		System.out.println("Double number: " + dn);
		
	}
}
