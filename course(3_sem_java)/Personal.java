import java.util.*;

class Main
{ int age;
  String name;
  String education;
  int basic;
  int da;
  int hra;
  int experience;
  int no_of_loans;
  int salary;
  int loan_amount;
  Main()
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter age");
	age=sc.nextInt();
    System.out.println("Enter name");
	name=sc.next();
    System.out.println("Enter education");
	education=sc.next();
	System.out.println("Enter basic salary");
	basic=sc.nextInt();
    System.out.println("Enter da");
	da=sc.nextInt();
	System.out.println("Enter hra");
	hra=sc.nextInt();
	System.out.println("Enter experience");
	experience=sc.nextInt();
	System.out.println("Enter no_of_loans");
	no_of_loans=sc.nextInt();
    System.out.println("Enter loan_amount");
	loan_amount=sc.nextInt();
	salary=basic+da+hra;
 }
	
	void is_eligible()
	{ if(loan_amount<10*salary&&no_of_loans<3)
      System.out.println("Eligible for loan");
      else
	   System.out.println("Sorry,you are not eligible for loan");

    }
	
	void taxpay()
	{ double tax;
	  if(salary<200000)
	  tax=0;
	  else if(salary>200000&&salary<600000)
	  tax=0.1*salary;
	  else
      tax=0.2*salary;
	  System.out.println("Tax to be paid is"+tax);
	}
	
	void is_eligible_promotion()
	{ if(experience>=10)
	  System.out.println("Eligible for promotion");
	  else
	  System.out.println("Ineligible for promotion");
    }
	
	void display()
	{ System.out.println("Name is"+name);
	  System.out.println("Age is"+age);
	  System.out.println("Experience is"+experience);
	  System.out.println("Salary is"+salary);
	  System.out.println("Education is"+education);
	  System.out.println("Loan amount is"+loan_amount);
	  System.out.println("No os loans is"+no_of_loans);
    }
	
	
	
}

class Personal
{ 
  public static void main(String args[])
	{  Scanner s=new Scanner(System.in);
	  int c;
	  
	  int n,i;
	 
	  System.out.println("Enter no of employees");
	  n=s.nextInt();
	  Main ob[]=new Main[n];
	  for(i=0;i<n;i++)
	  { ob[i]=new Main();
	    ob[i].is_eligible();
	    ob[i].taxpay();
	    ob[i].is_eligible_promotion();
	    
	  }
	  
	}
	
	
}