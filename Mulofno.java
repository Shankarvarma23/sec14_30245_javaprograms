import java.util.Scanner;
public class Mulofno
{
public static void main(String a[])
{
 Scanner sc =new Scanner(System.in);
 System.out.print("Enter the first value:");
 int n = sc.nextInt();

 System.out.print("Enter the second value:");
 int i = sc.nextInt();
 for (int j = i; i<=10; i++ )
{
  System.out.println(n+ "*" +i +"=" + n*i);
}

sc.close();
}
}