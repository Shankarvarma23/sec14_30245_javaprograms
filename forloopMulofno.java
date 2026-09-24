import java.util.Scanner;
public class forloopMulofno
{
public static void main(String a[])
{
 Scanner sc =new Scanner(System.in);
 System.out.print("Enter the first value:");
 int n = sc.nextInt();

 System.out.print("Enter the second value:");
 int i = sc.nextInt();
 while (i<=10)
{
  System.out.println(n+ "*" +i +"=" + n*i);
  i++;
}

sc.close();
}
}