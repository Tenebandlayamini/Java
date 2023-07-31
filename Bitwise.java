class Bitwise{
public static void main(String [] args){
int a=5;
int b=3;
System.out.println("AND Result:"+(a&b));
System.out.println("OR Result:"+(a|b));
System.out.println("XOR Result:"+(a^b));
System.out.println("Left Shift Result:"+(a<<b));
System.out.println("Right Shift Result:"+(a>>b));
System.out.println("unsigned Right Shift Result:"+(a>>>b));
System.out.println("complement Result:"+(~a));
}
}