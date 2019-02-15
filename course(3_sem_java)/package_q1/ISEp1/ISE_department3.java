package ISEp1;
import java.util.*; 
public class ISE_department3 extends Faculty3 implements Department3
{ Scanner sc=new Scanner(System.in);static int n;
 
   static Faculty3 a[]=new Faculty3[20];
  public void readdata()
  { int i;
	 System.out.println("Enter no of faculties");
    n=sc.nextInt();
    for(i=0;i<n;i++)
   { a[i]=new Faculty3(); 
    a[i].members_name=sc.next();
    a[i].designation=sc.next();
	try
	{  System.out.println("EEnter age");
	  a[i].age=sc.nextInt();
	  if(a[i].age>58)
	  throw new AgeException("Age>58");
	}
	catch(AgeException e)
	{ System.out.println("Age>58");
	
	}
	a[i].years_of_experience=sc.nextInt();
	a[i].joining_date=sc.nextInt();
	a[i].subjects_handled=sc.next();
   }
  }
  
  public void printdata()
  { for(int j=0;j<n;j++)
	{System.out.println(a[j].members_name);
     System.out.println(a[j].designation);
	 System.out.println(a[j].age);
	 System.out.println(a[j].years_of_experience);
	 System.out.println(a[j].joining_date);
	 System.out.println(a[j].subjects_handled);
    }
  }
  
  public void reasearch_consultancy_projs()
  { System.out.println(3);
  }	  
  public void print_number_designations()
  { 
	System.out.println(5);  
  }	  
}

class AgeException extends Exception
{ String a;
  AgeException(String b)
  { a=b;
  
  }
  public String toString()
  { return a;

  }  
}