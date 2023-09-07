import java.util.Scanner;
class Program06
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your age:");
int age=sc.nextInt();
if(age>=18 && age<=32)
{
System.out.println("your elgible for IAS  exam");
}
else{
System.out.println("your not elgible for IAS exam");
}

}
}
