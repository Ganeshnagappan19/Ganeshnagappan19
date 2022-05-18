package butji;
import java.util.Scanner;
public class Numpattern
{
public static void main(String [] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows");
int rows = scanner.nextInt();
  int k=0;
System.out.println("Printing Pattern");
for (int i = 1; i <= rows; i++)
{
for (int j = 1; j <= i; j++)
{
	{
System.out.print(rows + " ");

}
System.out.println();
}
}
}
}