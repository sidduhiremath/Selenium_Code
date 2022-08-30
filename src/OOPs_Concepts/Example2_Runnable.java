package OOPs_Concepts;

public class Example2_Runnable implements Runnable{

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

class Runnable_thread implements Runnable{
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

class sub2{
	public static void main(String args[]) {
		Example2_Runnable er= new Example2_Runnable();
		Thread t1=new Thread(er);
		Runnable_thread rt=new Runnable_thread();
		Thread t2=new Thread(rt);

		t1.run();
		t2.run();
		
		
	}
}

