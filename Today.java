import java.util.*;
class Today
{
public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter two integer numbers");
int a=scan.nextInt();
int b=scan.nextInt();
System.out.println("Addition result is"+(a+b));
System.out.println("Enter two real numbers");
float c=scan.nextFloat();
float d=scan.nextFloat();
System.out.println("Addition of real numbers is"+(c+d));
System.out.println("Enter two your name");
scan.nextLine();
String name = scan.nextLine();
System.out.println("name "+name);
System.out.println("Enter email id");
String email = scan.nextLine();
System.out.println("mail "+email);
}
}

