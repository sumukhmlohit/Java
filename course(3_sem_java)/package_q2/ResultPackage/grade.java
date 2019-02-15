package ResultPackage;
import StudentPackage.*;
import java.util.*;

class grade
{
   public static void main(String args[]) 
   { scgpa ob=new scgpa();Scanner sc=new Scanner(System.in);
     System.out.println("Enter semester");
	 int sem=sc.nextInt();
	 try
	 {
       int sgpa=ob.semsgpa(sem);
       System.out.println("SGPA of entered semester is "+sgpa);                    
       if(sgpa>10) throw new InvalidSGPA("Invalid SGPA");
	 }
	 catch(InvalidSGPA e)
	 { System.out.println("Invalid SGPA");
	 }
   }

}

class InvalidSGPA extends Exception
{ String b;
  InvalidSGPA(String a)
  { b=a;
  }
  public String toString()
  { return b;
  }
}