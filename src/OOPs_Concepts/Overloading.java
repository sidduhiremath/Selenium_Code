package OOPs_Concepts;
//Method Overloading
public class Overloading {

	public static void main(String[] args) {
		Parentclass cc=new Parentclass();
		cc.Project();

	}

}
class Parentclass{
	void Project() {
		System.out.println("I am from Working on EasyDocs");
	}
}

class Chaildclass extends Parentclass{
	void Project() {
		super.Project();
		System.out.println("I am from working on SCA");
	}
}
