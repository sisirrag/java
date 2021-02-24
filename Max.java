import java.io.*;
class Max
{
  public static void main(String args[])
  {
    int a,b,c;
    try
    {
      a=Integer.parseInt(args[0]);
      b=Integer.parseInt(args[1]);
      c=Integer.parseInt(args[2]);
      if(a>b && a>c)
      {
          System.out.println(a+" is Largest");
      }
      else if(b>c && b>a)
        {
          System.out.println(b+" is Largest");
        }
      else if(c>a && c>b)
      {
        System.out.println(c+" is Largest");
      }
      else
      {
        System.out.println("All are Equal");
      }



    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
