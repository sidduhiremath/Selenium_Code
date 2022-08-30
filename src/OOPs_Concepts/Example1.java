package OOPs_Concepts;

public class Example1 extends Thread{

	public void run() {
		try {
	for(int i=0;i<=5;i++) {
		Thread.sleep(4000);
		System.out.println(i);
	}
	System.out.println("End of thread1");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	
	}

}

class thread2 extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		
		}
		System.out.println("End of thread2");
}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		}
}

class sub{
	public static void main(String args[]) {
		Example1 t1= new Example1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		t1.setName("Siddu");
		System.out.println(t1.getName());

		System.out.println(t2.getName());
		
	}
}
