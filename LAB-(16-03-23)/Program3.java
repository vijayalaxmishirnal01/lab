class Program3{
public static void main(String args[])
{
int a=10;
int b=20;
int temp=0;
System.out.println(a+" "+b);
temp = a;
a = b;
b = temp;
System.out.println(a);
System.out.println(b);
}
}