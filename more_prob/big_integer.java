//In this problem, you have to add and multiply huge numbers! 
//These numbers are so big that you can't contain them in any ordinary data types like a long integer.

//Use the power of Java's BigInteger class and solve this problem.
//There will be two lines containing two numbers, a and b.
//Output two lines. The first line should contain a+B, and the second line should contain a x b. Don't print any leading zeros.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner sc = new Scanner(System.in);
      BigInteger a = new BigInteger(sc.next());
      BigInteger b = new BigInteger(sc.next());
      BigInteger c = a.add(b);
      BigInteger d = a.multiply(b);
      System.out.println(c);
      System.out.println(d);
        
    }
}

