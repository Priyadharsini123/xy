import java.util.*;
import java.io.*;
public class even
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
{
if(n%2==0)
{
System.out.println("Given number is even");
}
else
{
System.out.println("Given number is odd");
}
}
else
{
System.out.println("given number is negative");
}
}
}
