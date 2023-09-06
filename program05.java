import java.util.Scanner;
class Program05
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your age:");
int age=sc.nextInt();
if(age>=18)
{
System.out.println("your elgible for vote");
}
else{
System.out.println("your not elgible for vote");
}

}
}
