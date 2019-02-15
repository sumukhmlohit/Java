package StudentPackage;

public class scgpa
{   
   static RegisterStudent a[]=new RegisterStudent[4];
   static int sem1m,sem2m,sem3m,sem4m;
   public int semsgpa(int j)
   {  for(int i=0;i<4;i++)
      {
	    a[i]=new RegisterStudent();
		if(i==0)sem1m=a[i].marks();
		if(i==1)sem2m=a[i].marks();
		if(i==2)sem3m=a[i].marks();
    	if(i==3)sem4m=a[i].marks();	
	  }
	  if(j==1)return sem1m;
	  if(j==2)return sem2m;
	  if(j==3)return sem3m;
	  else return sem4m;
	  
   }
  

}