import java.util.Scanner;
class Program15
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your character:");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z')
{
if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='U'||ch=='u')
{
System.out.println(ch + "is vowel");
}
else
{
System.out.println(ch + "is a consnent");
}
}

else
{
System.out.println("it is not a character");
}
}
}