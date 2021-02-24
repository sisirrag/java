import java.io.*;
import java.util.*;

class SumOnetoN
{
  public static void main(String args[])
  {
    int i,n,sum=0;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter N:");
    n=s.nextInt();
    i=1;
    while(i<=n)
    {
      sum=sum+i;
      i++;
    }
    System.out.println("Sum="+sum);
  }
}
