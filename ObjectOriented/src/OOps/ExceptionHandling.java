package OOps;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[]args) {
		/*
		 * int a; int b;
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("value of a:");
		a = sc.nextInt();
		System.out.println("value of b:");
		b = sc.nextInt();
		
		
		try
		{
			System.out.println(a/b);


		}*/
		
		try(Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);){
			int a = sc.nextInt()/sc1.nextInt();
			//int b = sc1.nextInt();
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Print next");
	}

}}

