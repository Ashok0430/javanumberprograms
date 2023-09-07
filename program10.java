import java.util.Scanner;
class Program10
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int a= sc.nextInt();
System.out.println("enter second number:");
int b= sc.nextInt();
if(a>b){
System.out.println("a is bigger:"+a);
}
else if(b>a) {
System.out.println("b is bigger:"+b);
}
else if(a==b){
System.out.println("given number is equal");
}
else
System.out.println("not in digit");
}
}

