import java.util.Scanner;
class Program12
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int a= sc.nextInt();
System.out.println("enter second number:");
int b= sc.nextInt();
System.out.println("enter third number:");
int c= sc.nextInt();
if(a>b && a>c){
System.out.println("a is bigger:"+a);
}
else if(b>a && b>c) {
System.out.println("b is bigger:"+b);
}
else{
System.out.println("c is bigger");
}
}
}

