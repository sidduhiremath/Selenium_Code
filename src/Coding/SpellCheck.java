package Coding;
import java.util.Scanner;
public class SpellCheck {

	public static void main(String[] args) {
		int f=0;
		String[] s1 = null;
		String[] strings= {"Hi","Hello"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the senetance");
		String s=sc.next();
		sc.next();
		for(int i=0;i<strings.length;i++) {
			 s1=s.split(" ");
			
			if(s1[i].equalsIgnoreCase(strings[i])) {
				f++;
			}
			else {
				System.out.println("The word \""+s1[i]+"\" is wrong");
				break;			}
		}
		if (f==(s1.length)) {
			System.out.println("Sentance is correct");
		}
		

		sc.close();
	}

}
