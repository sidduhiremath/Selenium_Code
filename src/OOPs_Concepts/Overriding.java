package OOPs_Concepts;
//Method Overriding
public class Overriding {
	public static void main(String[] args) {
		subclass sc=new subclass();
    sc.add(10,20,30);
     }
	}

class mainclass{
	void add(int a, int b) {
		System.out.println("Result= "+(a+b));
	}
}
 
class subclass extends mainclass{
	void add(int a, int b,int c) {
		System.out.println("Result= "+(a+b+c));
	}

}