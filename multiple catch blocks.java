import java.util.*;
class mcb{
public static void main(String[]args)
{
try{
int arr[]=new int[5];
System.out.println(arr[10]);
}
catch(ArithmeticException ae)
{
System.out.println("Arithmetic Exception has occured");
}
catch(ArrayIndexOutOfBoundsException aiobe)
{
System.out.println("out of Bounds Exception");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
