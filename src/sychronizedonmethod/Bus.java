package sychronizedonmethod;

public class Bus implements Runnable{
	
	int available=2, passanger;
	
	public Bus(int passanger) {
		this.passanger=passanger;
	}

	@Override
	public synchronized void run() {
		String name=Thread.currentThread().getName();
		
		if(available>=passanger) {
			System.out.println(name+"Ticket book Successfully !!");
			available=available-passanger;
			System.out.println(available+" available Tickets !!");

		}else {
			System.out.println("sorry unable to book ticket seat reserved !!");

		}
	}
	

}
