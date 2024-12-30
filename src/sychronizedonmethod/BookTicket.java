package sychronizedonmethod;

public class BookTicket  {
	
	public static void main(String[] args) {
	
	Bus b= new Bus(1);
	
	Thread t1= new Thread(b);
	Thread t2= new Thread(b);
	Thread t3= new Thread(b);

	t1.setName("Mohini");
	t2.setName("Swati");
	t3.setName("Rohini");
	
	t1.start();
	t2.start();
	t3.start();

  }
}