//Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

//You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line. 

//Take your input from System.in.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
                
        
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());
            }
            list1.add(list);
        }
        
        
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = list1.get(x-1);
            if (y <= list.size()) {
                System.out.println(list1.get(x-1).get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}

    


