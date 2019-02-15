import java.util.*;

class Qlist
{  public static void main(String args[])
   { ArrayList<String> Q=new ArrayList<String>();
     int ch;Scanner sc=new Scanner(System.in);String a,b;
     System.out.println("Enter choice");
     while(true)
	 { ch=sc.nextInt();	
	   switch(ch)
	  { case 1:
	    System.out.println("Enter string to add");
		a=sc.next();
	    Q.add(a);break;
	    case 2:
		
	    Q.remove(0);break;
		case 3:
		Iterator<String> itr = Q.iterator();
        while(itr.hasNext())
        { String s = itr.next();
		  System.out.println(s);
        }
        break;
		case 4:
		Iterator<String>i1=Q.iterator();
		while(i1.hasNext())
		{ String s1=i1.next();
		  if(s1.length()<5)
		  System.out.println(s1);
		}
		break;
		case 5:
		System.exit(0);
	  }
	 }
   }

}