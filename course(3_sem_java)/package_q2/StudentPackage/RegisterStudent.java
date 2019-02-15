package StudentPackage;
import java.util.*;

public class RegisterStudent
{   Scanner sc=new Scanner(System.in);
    static int marks=0,credits=0,sgpa1;
    static int mark[]=new int[20];
    static int credit[]=new int[20];
	static int sgpa[]=new int[20];
  void getinfo()
  { System.out.println("Enter name");
    String name=sc.next();
	System.out.println("Enter branch");
    String branch=sc.next();
  }

  int marks()
  { System.out.println("Enter  no of subjects");
    int n=sc.nextInt(); 
    try 
    { for(int i=0;i<n;i++)
	  { System.out.println("Enter marks");
	    mark[i]=sc.nextInt();marks+=mark[i];
		System.out.println("Enter credits");
	    credit[i]=sc.nextInt();credits+=credit[i];
		if(mark[i]>90)
		{ sgpa[i]=10;System.out.println("Subject grade is S+");
		}
		else if(mark[i]>80){sgpa[i]=8;System.out.println("Subject grade is S");}
	  else if(mark[i]>70){sgpa[i]=7;System.out.println("Subject grade is A");}
		else if(mark[i]>60){sgpa[i]=6;System.out.println("Subject grade is B");}
	  else if(mark[i]>=50){sgpa[i]=5;System.out.println("Subject grade is C");}
	  else if(mark[i]>=40){sgpa[i]=4;System.out.println("Subject grade is D");}
	  else {sgpa[i]=0;System.out.println("Subject grade is F");}
		sgpa1+=sgpa[i];
	  }
	  if(credits>30)
	  throw new CreditLimit("Credits>30");
	  sgpa1=sgpa1/n;
	  
	}
	catch(CreditLimit e)
	{
		System.out.println("Credits>30");
    }		
   return sgpa1;
  }
}

class CreditLimit extends Exception
{ String b;
  CreditLimit(String a)
  { b=a;
  
  }
  public String toString()
  { return b;
  
  }
}