import java.util.*;
class fibonacciwithoutrec
{ public static void main(String args[])
  { int a=0,b=1,c,n,i=1;
    Scanner sc=new Scanner(System.in);    
    n=sc.nextInt();
	System.out.println(a+"\n"+b);
    while(i<=n)
	{ c=a+b;
	  System.out.println(c);
	  a=b;
	  b=c;
	  i++;
    }
  }



}