final class Employee
{
int salary=10000;
}
class Developer extends Employee
{
void show()
{
System.out.println("Good Morning");
}
}
class finalDemo
{
public static void main(String[]args)
{
Developer obj=new Developer();
obj.show();
}
}
