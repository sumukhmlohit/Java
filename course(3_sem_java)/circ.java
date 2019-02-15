import java.util.Scanner;
class circ
{
    public static void main(String args[])
    {
        double r;
        System.out.println("Enter the radius: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
		 System.out.println("Enter the angle ");
        double theta=sc.nextDouble();
		 System.out.println("Enter the arc length ");
        double l=sc.nextDouble();
		
        circle obj=new circle(r);
        System.out.println("Enter the radius and angle: ");
        sector obj1=new sector(r,theta);
        System.out.println("Enter the radius and arc length: ");
        segment obj2=new segment(r,l);
        System.out.println("Area of circle="+obj.area()+"\nArea of sector="+obj1.areasec()+"\nArea of segment="+obj2.areaseg());
    }
}

class circle
{
     double r;
    circle(double radius)
    {
        r=radius;
    }
    
    double area()
    {
        return (Math.PI*r*r);
    }
    
}
class sector extends circle
{
     double ang;
    sector(double rad,double angle)
    {
        super(rad);
        ang=angle;
    }
    
    double areasec()
    {
        return ((Math.PI*r*r)*(ang/(2*Math.PI)));
    }
}

class segment extends circle 
{
     double l;
    segment(double rad,double length)
    {
        super(rad);
        l=length;
    }
    
    double areaseg()
    {
        return (r*r*(Math.asin(l/(2*r))-(l/(2*r))*Math.sqrt(1-Math.pow((l/(2*r)),2))));
    }
}


        
        
    