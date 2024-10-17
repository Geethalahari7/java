import java.util.*;
public class ude
{
public static void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("Not Eligible to Vote");
}
else
{
System.out.println("Eligible");
}
}
public static void main(String[]args)
{
validate(19);
}}
