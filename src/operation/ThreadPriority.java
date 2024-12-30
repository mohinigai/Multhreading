package operation;

public class ThreadPriority extends Thread {

	// by default thread priority is =5

	@Override
	public void run() {
		System.out.println("run method is running");
	}

	public static void main(String[] args) {

		ThreadPriority d = new ThreadPriority();
		ThreadPriority d1 = new ThreadPriority();

		ThreadPriority d2 = new ThreadPriority();

		d.setPriority(NORM_PRIORITY);
		d2.setPriority(MIN_PRIORITY);
		d1.setPriority(MAX_PRIORITY);

		
		System.out.println(d.getPriority());
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());

	}
}
