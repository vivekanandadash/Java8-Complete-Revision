package methodRefference;

public class ThreadDemo2 {
	
public static void main(String[] args) {
		

	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 1 ; i<=10 ; i++) {
				System.out.println(i);
			}	
		}		
	};
	Thread thread = new Thread(runnable);
	thread.start();
}	

}
