class Employee
{
void display()
{
System.out.println("Hello");
}
}
class developer extends Employee
{
void display()
{
System.out.println("How are you");
}
}
class finalDemo
{
public static void main(String[]args)
{
developer obj=new developer();
obj.display();
}
}
