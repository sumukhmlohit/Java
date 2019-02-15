import java.util.*;

class strings
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.next();
	System.out.println("Enter starting index");
	int m=sc.nextInt();
	System.out.println("Enter no of characters");
    int n=sc.nextInt();
	System.out.println("Substring is "+s.substring(m,n+m));
	
	System.out.println("Enter a string to be replaced");
    String s3=sc.next();
	System.out.println("Enter a string that replaces");
	String s4=sc.next();
	System.out.println("String is "+s.replace(s3,s4));
	System.out.println("Sorted string is");
	char a2[]=s.toCharArray();
	Arrays.sort(a2);System.out.println(a2);
	System.out.println("Enter 2 strings");
	String s5=sc.next();String s6=sc.next();
	System.out.println("Comparison of strings is"+s5.compareToIgnoreCase(s6));
    String s7=s5+s6;
    System.out.println("Concatenated string is"+s7);	
	sc.nextLine();
	System.out.println("Enter a word");
	String s1=sc.nextLine();
	System.out.println("Enter a word for counting");
	String s2=sc.next();
	String a[]=s1.split(" ");
	int count=0;
	for(int i=0;i<a.length;i++)
	{ if(s2.equals(a[i])) 
	  count++;
	}
	System.out.println("No of occurrences is "+count);
  }

}