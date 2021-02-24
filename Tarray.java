
import java.io.*;
import java.util.*;

class Tarray
{
  public static void main(String args[])
  {
    int i=0,n,a[][],r,c,j=0;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter No. of Rows and Columns:");
    r=s.nextInt();
    c=s.nextInt();
    a=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print("Enter a["+i+"]["+j+"]");
        a[i][j]=s.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      System.out.println(" ");
      for(j=0;j<c;j++)
      {
        System.out.print(a[i][j]+" ");
      }
    }

  }
}
