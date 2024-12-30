package methodexcution;

  //Join method
public class Test {
	
  public static void main(String[] args) throws InterruptedException {
		
		MyThread mt = new MyThread();
		mt.start();
		
		for (int k = 0; k <= 5; k++) {
			System.out.println(mt+"Parent class");
        mt.join();
        
	}
}
}