import java.io.*;
import java.util.*;

class ArraySearch
{
  public static void main(String args[])
  {
    int i,n,a[],item=0,f=0,loc=0;
    Scanner s;
    s=new Scanner(System.in);
    System.out.print("Enter no. of elements:");
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
    System.out.print("Enter  element to Search:");
    item=s.nextInt();
    for(i=0;i<n;i++)
    {
      if(a[i]==item)
      {
        f=1;
        System.out.println("Found at "+i);
      }

    }
    if(f==0)
      System.out.println("Not Found");


  }
}
