import java.util.Scanner;
class Program07
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
if(n>=0)
{
System.out.println("your number is positive"+n);
}
else{
System.out.println("your number is negative "+n);
}

}
}
