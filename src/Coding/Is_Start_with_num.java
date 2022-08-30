package Coding;

import java.util.Scanner;

public class Is_Start_with_num {
	public static void main(String args[]){
		check();
	}
public static void check() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	System.out.println("You want to check Number string than enter 1 or You want to check Special character string than enter 2");
	try {
		int n=sc.nextInt();
		if(n==1) {
			is_num(s);
			System.exit(0);
			}
		else if(n==2) {
			is_Special_char(s);
			System.exit(0);
			}
		else
			System.out.println("Please enter  1 or 2");
		}
	
	catch(Exception e)
	{
		System.out.println("Wrong Respones\n");
		check();		
		sc.close();
	}
		
}
public static void is_num(String s) {
	//finding String starts with number
		if(Character.isDigit(s.charAt(0)))
		System.out.println("String Contains Numbers");

}

public static void is_Special_char(String s) {
	//String starts with Special character
		if(!(Character.isLetter(s.charAt(0))))
			System.out.println("String Contains Special Character");
}
}
