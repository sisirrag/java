import java.io.*;
class Add
{
  public static void main(String args[])
  {
    int a,b,s;
    try
    {
      a=Integer.parseInt(args[0]);
      b=Integer.parseInt(args[1]);
      s=a+b;
      System.out.println(s);


    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
