class A
{
public void team()
{
System.out.println("parent class");
}
}
class B extends A
{
public void team()
{
System.out.println("child class");
}
void display()
{
super.team();
team();
}
public static void main(String[]args)
{
B obj=new B();
obj.display();
}
}
