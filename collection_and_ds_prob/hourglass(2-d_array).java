//You are given a  2D array. An hourglass in an array is a portion shaped like this:
//a b c
//  d
//e f g
//For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
//1 1 1     1 1 0     1 0 0
//  1         0         0
//1 1 1     1 1 0     1 0 0
//The sum of an hourglass is the sum of all the numbers within it. 
//The sum for the hourglasses above are 7, 4, and 2, respectively.
//In this problem you have to print the largest sum among all the hourglasses in the array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        
        Sum(arr);
        
    }
    
    
    
    
    private  static void Sum(int arr[][]){
            //ROw
            int sum=-1000;
            for(int i =0 ; i<4;i++){
                for(int x =0 ; x<4; x++){
                    
                    int top = arr[i][x]+arr[i][x+1]+arr[i][x+2];
                    int middle = arr[i+1][x+1];
                    int bottom = arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2];
                    if(top+middle+bottom>sum){sum=top+middle+bottom;}
                }
            }
            System.out.println(sum);
            
            
        }
}

