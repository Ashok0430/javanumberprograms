import java.util.Scanner;
class Program09
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your digit:");
int n=sc.nextInt();
if(n>=0 && n<=9)
System.out.println("your enter number is digit:"+n);
else
System.out.println("your entered as value:"+n);
}
}