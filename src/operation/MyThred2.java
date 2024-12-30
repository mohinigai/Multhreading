package operation;

public class MyThred2  {
	
	public static void main(String[] args) {
		
		//getCurrent ThreadName
		Thread t1=Thread.currentThread();
		String t2= t1.getName();
		System.out.println("current thread name = "+ t2 );
		t1.setName("MyMain");
		System.out.println("current thread name = "+ t1 );

		try {
			Thread.sleep(1000);
	}catch(Exception e) {
		
	}
		System.out.print(t1.getId());
		System.out.println( "Program ended");
	 
	}
}
