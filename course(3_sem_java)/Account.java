import java.util.*;

class Account
{ Scanner sc=new Scanner(System.in);
  int acc_no,ph_no;
   String name;
   static float balance_amt;
  
  void getinput()
  { 
   
   acc_no=sc.nextInt();
   ph_no=sc.nextInt();
   name=sc.next();
   balance_amt=sc.nextFloat();

  }
  
  void Deposit()
  { System.out.println("Enter the amount to be deposited");
    float deposit=sc.nextFloat();
    balance_amt=balance_amt+deposit;
    System.out.println("Amount deposited is "+deposit);
	System.out.println("New balance is"+balance_amt);
  }

  void Withdraw()
  { System.out.println("Enter the amount to be withdrawn");
    float withdraw=sc.nextFloat();
    if(withdraw>balance_amt)
	System.out.println("Insufficient balance");
	else
	{ balance_amt=balance_amt-withdraw;
      System.out.println("Amount withdraw is "+withdraw);
	  System.out.println("New balance is"+balance_amt);
    }
  }
  
  public static void main(String args[])
  { int choice;
    System.out.println("Enter the choice: 1 for deposit,2 for withdraw");
    Scanner s=new Scanner(System.in);
	choice=s.nextInt();
	Account obj=new Account();
    obj.getinput();
    switch(choice)
	{ case 1:
	  { obj.Deposit();
	    break;
	  }
	  case 2:
	  { obj.Withdraw();
	    break;
	  }
	
	 
	
    }System.out.println("The net balance is"+balance_amt); 
	
  }
  
}