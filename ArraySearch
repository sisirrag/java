import java.io.*;
import java.util.*;

class Arrayrev
{
  public static void main(String args[])
  {
    int i,n,a[],temp=0,j;
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
    i=0;
    j=n-1;
    while(i<j)
    {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      i++;
      j--;
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}
