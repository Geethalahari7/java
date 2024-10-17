import java.util.*;
class eh
{
public static void main(String[]args)
{
try{
int a=10;
System.out.println(a/0);
}
catch(ArithmeticException ae)
{
System.out.println(ae);
}
finally
{
System.out.println("Finally block was arrived");
}
}
}
