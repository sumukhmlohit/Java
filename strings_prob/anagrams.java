//Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.//

//Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.//

import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) 
{
   if(a.length() != b.length())
   return false;
   a= a.toLowerCase();
   b= b.toLowerCase();
   int t;
    for(int i=0;i<a.length();i++)
    {
        t =b.indexOf(a.charAt(i));
        if(t==-1)
        return false;
        else
        {
            
            b = b.substring(0,t) + b.substring(t+1,b.length());
        }
    }
    return true;
}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}