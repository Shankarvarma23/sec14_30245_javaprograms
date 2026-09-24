import java.util.Scanner;
public class Studentdet
{
public static void main (String arg[])
{
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter your name: ");
 String name = scanner.nextLine();

 System.out.print("Enter your roll number: ");
 int rollNo = scanner.nextInt();

 System.out.print("Enter marks in subject 1: ");
 int s1 = scanner.nextInt();

 System.out.print("Enter marks in subject 2: ");
 int s2 = scanner.nextInt();
 
 System.out.print("Enter marks in subject 3: ");
 int s3 = scanner.nextInt();

 System.out.print("Enter marks in subject 4: ");
 int s4 = scanner.nextInt();

 System.out.print("Enter marks in subject 5: ");
 int s5 = scanner.nextInt();
 
 int total = s1+s2+s3+s4+s5;
 int average = total/5;

System.out.println("/nStudent Details");
System.out.println("Name =" + name);
System.out.println("roll number =" + rollNo);
System.out.println("Total marks =" + total);
System.out.println("Average = " + average);

 if (average >= 90)
{
 System.out.println("Grade O");
}
 else if (average >= 80 )
{
 System.out.println("Grade A");
}
 else if (average >= 70 )
{
 System.out.println("Grade B");
}
 else if (average >= 60 )
{
 System.out.println("Grade C");
}
 else if (average >= 50 )
{
 System.out.println("Grade D");
}
 else 
{
 System.out.println("Fails");
}


scanner.close();
}
}