import java.io.*;
import java.util.*;

class OnetoN
{
  public static void main(String args[])
  {
    int i,n;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter N:");
    n=s.nextInt();
    i=1;
    while(i<=n)
    {
      System.out.println("i="+i);
      i++;
    }
  }
}
