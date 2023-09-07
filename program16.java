import java.util.Scanner;
class Program16
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your character:");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z')
{
if(ch>='A' && ch<='Z')
{
System.out.println(ch + "  is in upper case");
}
else
{
System.out.println(ch + "is in lower case");
}
}

else
{
System.out.println("it is not a character");
}
}
}