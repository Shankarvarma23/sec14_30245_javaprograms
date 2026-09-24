import java.lang.*;
public class cost
{
public static void main (String a[])
{
 int l=45000;
 int m=500;
 int k=1500;

 int three=l+m+k;
 int GST=(three*18)/100;
 int total=three+GST;

 System.out.println("total="+total);
 System.out.println("three="+three);
 System.out.println("GST="+GST);
}
}