package Coding;

public class Decimal_To_Binary {

	public static void main(String[] args) {
int n=216;
Decimal_To_Binary db=new Decimal_To_Binary();
db.recursion(n);
	}
	public  void recursion(int n) {
		if(n>0) {
		this.recursion(n/2);
		System.out.print(n%2);
	}}

}
