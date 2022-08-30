package OOPs_Concepts;



public class Inheritance {

	public static void main(String[] args) {
		Easy ed=new Easy();
		ed.Project();
		EDC sca=new EDC();
		sca.project();
			}
}

class Members{
	void project() {
		System.out.println("we are from prevalidation team");
	}
}
//Single level inheritance	
class Easy extends Members{
			void Project() {
				super.project();

				System.out.println("Siddu is working on EasyDocs");
			}
			
		}
//Multilevel inheritance
class EDC extends Members{
	void project() {
		super.project();
		System.out.println("Siri is working on SCA");
	}
}