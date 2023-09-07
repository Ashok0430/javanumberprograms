import java.util.Scanner;
class Program14
{
public static void main(String [] args)
{
Scanner sc =new Scanner(String [] args)
{
System.out.println("using ternary operator");
System.out.println("enter first number:");
int a=sc.nextInt();
System.out.println("using second number:");
int b=sc.nextInt();
System.out.println("using third number:");
int c=sc.nextInt();
String result=(a>b && a>c) ? : "a is bigger" : (b>a && b>c) ? : "b is bigger" : "c is bigger";
System.out.println(result);
}
}

