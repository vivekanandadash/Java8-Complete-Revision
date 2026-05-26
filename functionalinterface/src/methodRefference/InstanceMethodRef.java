package methodRefference;

public class InstanceMethodRef {
	public void m1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		InstanceMethodRef instanceMethodRef  = new InstanceMethodRef();
	
		 Runnable run = instanceMethodRef::m1;
		 Thread thread = new Thread(run);
		 thread.start();
	}

}
