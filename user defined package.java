package pack;
public class PackageDemo
{
public void show()
{
System.out.println("Users Defined Package");
}
} 
//it is the package class

import pack.PackageDemo;
class A
{
public static void main(String[]args)
{
PackageDemo obj=new PackageDemo();
obj.show(); 
}
}

//it is the class where we are implement packages using this class

Execution
javac -d . PackageDemo.java
javac A.java
java A
