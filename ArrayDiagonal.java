import java.io.*;
import java.util.*;

class ArrayDiagonal
{
  public static void main(String args[])
  {
    int i=0,n,a[][],r,c,j=0;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter No. of Rows:");
    r=s.nextInt();
    c=r;
    a=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print("Enter a["+i+"]["+j+"]:");
        a[i][j]=s.nextInt();
      }
    }
    System.out.println("Forward Diagonal: ");
    for(i=0;i<r;i++)
    {
      System.out.println(" ");
      for(j=0;j<c;j++)
      {
        if(i==j)
            System.out.print(a[i][j]+" ");
        else
            System.out.print(" ");
      }
    }
    System.out.println("\nBackward Diagonal:");
    for(i=0,j=r-1;i<r;i++,j--)
    {

        System.out.print(a[i][j]+" ");

    }


  }
}
