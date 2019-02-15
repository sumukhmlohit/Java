import java.util.*;
class bubblesort
{ public static void main(String args[])
  { int a[]=new int[10];
    int i,j,n,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
	n=sc.nextInt();
	System.out.println("Enter the elements to be sorted");
	for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    
	for(i=0;i<n-1;i++)
	{ for(j=0;j<n-i-1;j++)
      { if(a[j]>a[j+1])
	    { temp=a[j];
		  a[j]=a[j+1];
		  a[j+1]=temp;
		}
	  }
	}  
	
	System.out.println("The sorted array is");
	for(i=0;i<n;i++)
	System.out.println(a[i]);
	
	
  }

}