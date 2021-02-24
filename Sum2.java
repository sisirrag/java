import java.io.*;
import java.util.*;

class Sum2
{
  public static void main(String args[])
  {
    int n,t=0,sum=0,i=1;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter value of n:");
    n=s.nextInt();

    while(i<=n)
    {
      t=t+i;
      sum=sum+t;
      i++;
    }
    System.out.println(sum);
  }
}
