package howto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {

		String s = "reverse";
		
		System.out.println(new StringBuilder(s).reverse());
		
		String line = null;
        BufferedReader br = null;
        do{
                System.out.print("Digite sua idade: ");
                br = new BufferedReader(new InputStreamReader(System.in));
                line = br.readLine();
                if(line!=null && !line.isEmpty()){
                       
                        int idade = Integer.parseInt(line);
                        if (idade <= 18 || idade >= 127) {
                                System.out.println("Erro! Idade abaixo ou acima do limite.");
                        }
                }else {
                        System.out.println("Erro! Campo idade vazio");
                }
               
               
        }while(line!=null && !line.isEmpty());
		
	}
	
}
