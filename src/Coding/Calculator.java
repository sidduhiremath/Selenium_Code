package Coding;

import java.util.Scanner;

public class Calculator {
public static void main(String a[]) {
	double x,y;
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter Numbers");
	x=sc.nextDouble();
	y=sc.nextDouble();
	System.out.println(x+y);
	System.out.println("Do you want to coninue? if yes enter 1 or enter 2");
	if(sc.nextInt()==1) {
		Calculator.main(a);
	}
	else {
		 System.out.println("Thanku for using our Calculator!");

		System.exit(0);

	}

	}
	catch(Exception e){
		System.out.println("Please enter Numertic value");
		Calculator.main(a);
		
	}
     finally {
	sc.close();
}
}
}
