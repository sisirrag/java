import java.io.*;
import java.util.*;
class CArray
{
  int a[],n;
  public CArray()
  {
    n=5;
    a=new int[n];
  }
  public CArray(int s)
  {
    n=s;
    a=new int[n];
  }

  public void readarray()
  {
    Scanner s=new Scanner(System.in);
    int i;
    for(i=0;i<n;i++)
    {
      System.out.println("Enter a["+i+"]");
      a[i]=s.nextInt();
    }
  }
  public void disparray()
  {
    int i;
    for(i=0;i<n;i++)
      System.out.println(a[i]+"  ");
  }
}

class MArray
{
  public static void main(String args[])
  {

    CArray a1 =new CArray(5);
    a1.readarray();
    a1.disparray();


  }
}
