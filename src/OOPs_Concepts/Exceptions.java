package OOPs_Concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions  {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);

		try {
int a;
System.out.println("Enter the value");
a=sc.nextInt();
if(a==0) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
		
		}
		catch(Exception e) {
			System.out.println("Index out of range or Please give integer values");
		}
		
		finally {
			sc.close();
			System.out.println("Program terminated");
		}
	}

}
