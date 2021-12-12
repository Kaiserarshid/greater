import java.util.Scanner;
public class greater
{
public static void main(String[] args)
{
int a,b,c;

Scanner sc=new Scanner(System.in);

System.out.println("Enter First Number");
a=sc.nextInt();

System.out.println("Enter Second Number");
b=sc.nextInt();

System.out.println("Enter Third Number");
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("A is Greater NUmber");
}
else if(b>a && b>c)
{
System.out.println("B is Greater Number");
}
else
{
System.out.println("C is Greater Number");
}
}
} 