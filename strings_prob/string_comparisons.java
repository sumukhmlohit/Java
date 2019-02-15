//We define the following terms://

//Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: //
//A<B...<Z<a<b<...z//
//For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.//

//A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.//
//Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .//

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++)
        { if(smallest.compareTo(s.substring(i,i+k))>0)
           smallest=s.substring(i,i+k);
           if(largest.compareTo(s.substring(i,i+k))<0)
           largest=s.substring(i,i+k);
            
          
       
        }
     return (smallest+"\n"+largest);    
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}