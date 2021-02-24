import java.io.*;
import java.util.*;

class MtoN
{
  public static void main(String args[])
  {
    int i,m,n;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter m:");
    m=s.nextInt();
    System.out.println("Enter n:");
    n=s.nextInt();

    while(m!=n)
    {
      System.out.println(m);
      if(m<n)
        m++;
      else
        m--;
    }
    System.out.println(m);

  }
}
