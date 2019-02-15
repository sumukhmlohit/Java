import java.util.*;
class primewithoutrec
{ public static void main(String args[])
  { int n,i,flag=0;
    Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
    for(i=2;i<=n/2;i++)
	{ if(n%i==0)
      flag=1;

	}
	if(flag==0)
	System.out.println("Prime number");
	else
	System.out.println("Not a prime number");
	
  }



}