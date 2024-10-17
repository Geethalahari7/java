import java.util.*;
class bie
{
public static void main(String[]args)
{
try
{
int a=10;
System.out.println(a/0);
}
catch(ArithmeticException ae)
{
System.out.println("Arithmetic exception has occured");
}
try {
int arr[]=new int[5];
System.out.println(arr[7]);
}
catch(Exception e)
{
System.out.println(e);
}
try
{
String str=null;
System.out.println(str.length());
}
catch(NullPointerException npe)
{
System.out.println(npe);
}
}
}
