import java.util.Scanner;
class Program08
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter male age:");
int m=sc.nextInt();
System.out.println("enter female age:");
int f=sc.nextInt();
if(m>=21 && m<=30)
{
if(f>=18 && f<=25)
{
System.out.println("you are eligible for marriage");
}
else{
System.out.println("you are not eligble for marriage");
}
}
else{
System.out.println("not eligible for marriage");
}
}
}
