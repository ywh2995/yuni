package thread.ex01;

public class MainClass02 {
	public static void main(String[] args) {
	
		// 객체 1개, 스레드 n개(1개의 객체를 실행)
		
		ThreadTest t1 = new ThreadTest();
		
		Thread thread1=new Thread(t1,"A");
		Thread thread2=new Thread(t1,"B");
		
		thread1.start();
		thread2.start();
		
		
	}
	
}
