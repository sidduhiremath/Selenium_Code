package OOPs_Concepts;

public class Marks {
	int finalmarks=20;

	public static void main(String[] args) {
		Student s=new Student();
		s.div_A();
		Stu s1=new Stu();
		s1.div_B();
	}
}

    class Student extends Marks
{
    	int score=19;
    	void div_A() {
    		System.out.println("Student from Div_A scored "+score+" Out of "+finalmarks);
    	}
	}
    
    
    class Stu extends Marks
{
    	int score=8;
    	void div_B() {
    		System.out.println("Student from Div_A scored "+score+" Out of "+finalmarks);
    	}
	}