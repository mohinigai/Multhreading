package methodexcution;

//Sleep method 
public class MyThread extends Thread {
	
	@Override
	public void run() {

		for (int k = 0; k <= 5; k++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child class");
		}
	}
}
