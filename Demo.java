import java.util.Scanner;
class Demo
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=scan.nextInt();
int b=scan.nextInt();
int c=a+b;
System.out.println("Addition result is:"+c);
c=a-b;
System.out.println("Substraction result is:"+c);
c=a*b;
System.out.println("multiplication result is:"+c);
c=a/b;
System.out.println("division result is:"+c);
}
}
