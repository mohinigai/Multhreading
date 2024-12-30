package crateThread;

//To create Thread by using runnable interface

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int t=0;t<=5;t++) {
			System.out.println("value of thread"+t);
		}
	}
	public static void main(String[] args) {
		
		MyThread m= new MyThread();
		Thread t1= new Thread(m);
		t1.start();
		
	}

}
