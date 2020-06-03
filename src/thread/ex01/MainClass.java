package thread.ex01;

public class MainClass {

	public static void main(String[] args) {
		// 객체 2개 스레드 2개 각각 실행
		
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		Thread thread1 = new Thread(t1,"A");
		Thread thread2 = new Thread(t2,"B");
		
		thread1.start();
		thread2.start();
		System.out.println("메인클래스");
	}

}
