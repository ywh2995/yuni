package thread.thread;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		//쓰레드의 기능을 전부 상속받아서 사용할 수 있다.
		System.out.println(getName());
		System.out.println("쓰레드시작!");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
