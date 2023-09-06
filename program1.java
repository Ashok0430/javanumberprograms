import java.util.Scanner;
class Program01
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int a=sc.nextInt();
System.out.println("enter second number:");
int b= sc.nextInt();
System.out.println("Before swapping a and b is :"+a+","+b);
int temp;
temp = a;
a = b;
b= temp;
System.out.println("after swapping a and b is :"+a+","+b);
}
}
