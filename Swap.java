import java.io.*;
class Swap
{
  public static void main(String args[])
  {
    int a,b,temp;
    try
    {
      a=Integer.parseInt(args[0]);
      b=Integer.parseInt(args[1]);
      temp=a;
      a=b;
      b=temp;
      System.out.println("Swapped "+a+" "+b);


    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
