import java.util.*;
abstract class Vehicle
{ int yom;
  public abstract void getData();
  public abstract void putData();
}

class TwoWheeler extends Vehicle
{ String color,brand;Scanner sc=new Scanner(System.in);
  public void getData()
  { System.out.println("Enter colour");
    color=sc.next();
    brand=sc.next();
  }
  public void putData()
  { System.out.println("colour is "+color+"brand is "+brand);
  
  }
  
}

final class FourWheeler extends Vehicle
{ String color,brand;Scanner sc=new Scanner(System.in);
  public void getData()
  { System.out.println("Enter colour");
    color=sc.next();
    brand=sc.next();
  }
  public void putData()
  { System.out.println("colour is "+color+"brand is "+brand);
  
  }
  
}

class MyTwoWheeler extends TwoWheeler
{ String OwnerName;
  MyTwoWheeler(String ow,String br,String co)
  { OwnerName=ow;
    super.color=co;super.brand=br;OwnerName=ow;
  }
  public void print()
  { System.out.println("Color is "+super.color+"Brand is "+super.brand+"Owner is "+OwnerName);
  
  }
}

class MainVehicle
{ public static void main(String args[])
  { TwoWheeler tw=new TwoWheeler();
    tw.getData();tw.putData();
	FourWheeler fw=new FourWheeler();
    fw.getData();fw.putData();
    MyTwoWheeler mtw=new MyTwoWheeler("Sumukh","Bajaj","red");
    mtw.print();
  }
  
}