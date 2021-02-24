import java.io.*;
import java.util.*;

class Read
{
  public static void main(String args[])
  {
    int age;
    String name;
    Scanner s;
    s=new Scanner(System.in);
    System.out.println("Enter Name:");
    name=s.nextLine();
    System.out.println("Enter Age:");
    age=s.nextInt();
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
  }
}
