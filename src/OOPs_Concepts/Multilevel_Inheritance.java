package OOPs_Concepts;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		easydc es=new easydc();
		es.project();
		es.easyDocs();
		es.project1();
		

		
			}
			void project() {
				System.out.println("we are from prevalidation team");
			}

		}

		 class easyd extends Members{
			void easyDocs() {
				System.out.println("Siddu is working on EasyDocs");
			}
			
		}

		 class easydc extends easyd{
			void project1() {
				System.out.println("Siri is also working on Easydocs");
			}
			
		}