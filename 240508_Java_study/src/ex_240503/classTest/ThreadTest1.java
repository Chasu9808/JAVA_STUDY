package ex_240503.classTest;

// 작업순서1, 클래스에서 스레드 클래스 상속 받기
public class ThreadTest1 extends Thread {
	
	//
	int n = 0;
	// 작업순서2, run 메소드를 재정의. 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			System.out.println("숫자 카운트 스레드1 : " + n);
			n++;
			// 잠시 대기 
			try {
				//1000ms = 1초 와 같다. 
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		//작업순서3, 
		// Thread 클래스 상속받은 클래스의 인스턴스 생성하기. 
		ThreadTest1 threadTest1 = new ThreadTest1();
		ThreadTest2 threadTest2 = new ThreadTest2();
		ThreadTest3 threadTest3 = new ThreadTest3();
		ThreadTest4 threadTest4 = new ThreadTest4();
		//작업순서4.
		// start 메소드 호출하면, run 메소드가 호출이 되어 스레드가 동작함.
		threadTest1.start();
		threadTest2.start();
		threadTest3.start();
		threadTest4.start();
	}
	
	

}





