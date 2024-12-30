package crateThread;

  // To create Thread by using Thread class
public class MyThread1 extends Thread {

	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("Byusing Thread class creating the Thred" + i);
			
			try {

				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThread1 t= new MyThread1();
		t.start();
		MyThread t1= new MyThread();
		
		Thread thr= new Thread(t1);
		thr.start();
	}

}
