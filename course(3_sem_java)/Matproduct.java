import java.util.*;

class Matproduct
{ int r1,r2,c1,c2;
  static int a[][]=new int[10][10]; 
  static int b[][]=new int[10][10];
  int prod[][]=new int[10][10];int i,j;
  Scanner sc=new Scanner(System.in);
  Matproduct(int r1,int r2,int c1,int c2)
  {   System.out.println("Enter the elements of 1st matrix");
     if(c1==r2)
   	 { for(i=0;i<r1;i++)
      { for(j=0;j<c1;j++)
        { a[i][j]=sc.nextInt();
	  
	    }
	  }
	  System.out.println("Enter the elements of 2nd matrix");
      for(i=0;i<r2;i++)
      { for(j=0;j<c2;j++)
        { b[i][j]=sc.nextInt();
	  
	    }
	  }
	 }
  }
  
  void product(int r1,int r2,int c1,int c2)
  { int k;
    for(i=0;i<c1;i++)
      { for(j=0;j<c2;j++)
        { prod[i][j]=0;
		  for(k=0;k<r2;k++)
		  { prod[i][j]=prod[i][j]+a[i][k]*b[k][j];
		  
		  }
	  
	    }
	  }
	
	System.out.println("Product of matrices is");
   for(i=0;i<r1;i++)
   { for(j=0;j<c1;j++)
     { System.out.print(prod[i][j]+" ");
   
     }System.out.println("");
   }
	
	
  }
  public static void main(String args[])
  { int r1,r2,c1,c2;Scanner s=new Scanner(System.in);
    System.out.println("Enter no rows and columns of matrices");
    r1=s.nextInt();
	c1=s.nextInt();
	r2=s.nextInt();
	c2=s.nextInt();
    Matproduct ob=new Matproduct(r1,r2,c1,c2);
   ob.product(r1,r2,c1,c2);
   
  }
}