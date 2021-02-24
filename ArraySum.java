import java.io.*;
import java.util.*;

class ArraySum
{
  public static void main(String args[])
  {
    int i=0,n,a[],seve=0,sodd=0;
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
        System.out.print(a[i]+" ");

    for(i=0;i<n;i++)
    {
      if(a[i]%2==0)
          seve+=a[i];

      else
          sodd+=a[i];
    }
    if(sodd==seve)
      System.out.println("Sum of Odd and Even numbers are same");
    else
      System.out.println("Sum of Odd and Even numbers are not same");
  }

}
