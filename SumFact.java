import java.io.*;
import java.util.*;

class SumFact
{
  public static void main(String args[])
  {
    int n,i=1;
    float f=1,sum=0;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter value of n:");
    n=s.nextInt();

    for(i=1;i<=n;i++)
    {
      f=f*i;
      sum=sum+(i/f);
    }
    System.out.println(sum);
  }
}
