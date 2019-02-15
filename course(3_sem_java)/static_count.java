class static_count
{ static int count;
  static_count()
  {count++;
  }
  
  public static void main(String args[])
  { static_count ob1=new static_count();
    static_count ob2=new static_count();
    System.out.println(count);
  }

}