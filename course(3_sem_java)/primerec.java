import java.util.*;
class primerec
{ int prime(int n,int i)
  { if(i<n)
    {  if(n%i==0)
	   return 0;
	   else
	   return prime(n,++i);
	}
	return 1;

  }
  
  public static void main(String args[])
  {  int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
	 n=sc.nextInt();
     primerec ob=new primerec();
     int x=ob.prime(n,2);
	 if(x==0)
     System.out.println("Not a prime number");
     else
	 System.out.println("Prime number");
	 
  }


}