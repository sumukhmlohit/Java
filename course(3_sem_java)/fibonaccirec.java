import java.util.*;

class fibonaccirec
{ int fibonacci(int n) 
  { if(n==0)
    return 0;
	else if(n==1)
	return 1;
	return fibonacci(n-1)+fibonacci(n-2);

  }
  
  public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of terms");
	int n=sc.nextInt();
	fibonaccirec ob=new fibonaccirec();
	System.out.println("Fibonacci series for"+n+"numbers"+"is");
    for(int i=0;i<n;i++)
	System.out.println(ob.fibonacci(i));
  }

  
  
}