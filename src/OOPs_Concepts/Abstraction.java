package OOPs_Concepts;

public class Abstraction  {

	public static void main(String[] args) {
EasyDocs ed=new EasyDocs();
ed.OQ_drafting();
	}

}

abstract class Projects{
	abstract public void OQ_drafting();
}

class EasyDocs extends Projects{
	public void OQ_drafting() {
		System.out.println("EasyDocs Drafting is started");
	}
	
}