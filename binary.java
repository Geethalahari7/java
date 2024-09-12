import java.util.*;
class binary
{
public static void bs(int arr[],int first,int last,int key)
{
int mid=(first+last)/2;
while(first<=last)
{
if(arr[mid]<key)
{
first=mid+1;
}
else if(arr[mid]==key)
{
System.out.println(mid);
break;
}
else{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last)
{
System.out.println("Element is not found");
}
}
public static void main(String[]args)
{
int arr[]={23,45,67,89,100};
int key=43;
int last=arr.length-1;
bs(arr,0,last,key);
}
