package OOPs_Concepts;

public class Membersclass {

	public static void main(String[] args) {
EasyDocssca es=new EasyDocssca();
es.project();
es.project1();

EDCproject edc=new EDCproject();
edc.project();
edc.project1();
	}
	void project() {
		System.out.println("I am from prevalidation team");
	}

}

class EasyDocssca extends Members{
	void project1() {
		System.out.println("Siddu is working on EasyDocs");
	}
	
}

class EDCproject extends Members{
	void project1() {
		System.out.println("Siri is working on EDC");
	}
	
}