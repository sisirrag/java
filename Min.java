import java.io.*;
class Min
{
  public static void main(String args[])
  {
    int a,b,c;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    c=Integer.parseInt(args[2]);

    System.out.println(a<b && a<c ?a:(b<c?b:c));
  }
}
