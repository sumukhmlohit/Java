//A prime number is a natural number greater than 1 whose only positive divisors are  and itself. For example, the first six prime numbers are 2,3,5,7,11,and 13.

//Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      
      System.out.println(n.isProbablePrime(10) ? "prime" :"not prime");
        scanner.close();
    }
}
