import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        String []s=new String[n+2];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        String aux;
        
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                BigDecimal b1 = new BigDecimal(s[j]);
                BigDecimal b2 = new BigDecimal(s[k]);
                if (b1.compareTo(b2) > 0) {
                    k = j;
                }
            }
            aux = s[k];
            s[k] = s[i];
            s[i] = aux;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}