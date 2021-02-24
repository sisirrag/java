import java.io.*;
import java.util.*;

class Array
{
  public static void main(String args[])
  {
    int i,n,a[];
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter m:");
    n=s.nextInt();
    a=new int[n];
    for(i=0;i<n;i++)
    {
      System.out.print("Enter a["+i+"]:");
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}
