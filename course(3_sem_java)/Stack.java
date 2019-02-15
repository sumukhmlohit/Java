import java.util.*;
class Stack
{  int n,top,s[];
    
  Stack()
  { 
    s=new int[10];
    top=-1;  
  }

  void push()
  { int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element");
	x=sc.nextInt();  
    if(top==10)
	System.out.println("Stack overflow");
	s[++top]=x;
  
  }

  void pop()
  { if(top==-1)
    System.out.println("Stack underflow");
	else
    top--;
    
  }
  
  void display()
  { for(int i=0;i<=top;i++)
    System.out.println(s[i]);
  }
  
  public static void main(String args[])
  { 
    int ch;
	
	Scanner s1=new Scanner(System.in);
	Stack ob=new Stack();
	while(true)
	{
	ch=s1.nextInt();
	switch(ch)
	{ case 1:
	 {ob.push();
	  break;
	 }
	  case 2:
	 { ob.pop();
	    break;
     }
	 case 3:
	 { ob.display();
	    break; 
	 }
	  default:
	  System.exit(0);
    }
	}
  }
  
}