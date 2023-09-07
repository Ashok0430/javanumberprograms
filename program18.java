import java.util.Scanner;
class Program18
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your character:");
char ch=sc.next().charAt(0);
switch(ch)
{
case 'A':
case 'a':
case 'E':
case 'e':
case 'I':
case 'i':
case 'O':
case 'o':
case 'U':
case 'u':
System.out.println( ch  + "is a vowel");
break;
default:
System.out.println(ch  + "is a consonent");
break;
}
}
}
 