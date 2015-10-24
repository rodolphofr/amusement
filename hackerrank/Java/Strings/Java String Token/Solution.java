import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      String s=scan.nextLine();
        
      StringTokenizer tokenizer = new StringTokenizer(s, "!,?._'@ ");

      System.out.println(tokenizer.countTokens());
    
      while (tokenizer.hasMoreTokens()) {
          System.out.println(tokenizer.nextToken());
      }
        
    }
}