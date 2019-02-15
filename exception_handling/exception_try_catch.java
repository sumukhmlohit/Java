//You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. 
//Read sample Input/Output to know what to report in case of exceptions.//

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
      try{
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            int result = x/y;
            System.out.println(result);
        } catch(Exception e){
            System.out.println(e);
        }
    } catch(Exception e){
        System.out.println("java.util.InputMismatchException");
    }
    
    }
}

