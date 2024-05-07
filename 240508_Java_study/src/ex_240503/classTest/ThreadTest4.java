package ex_240503.classTest;

public class ThreadTest4 extends Thread {
	int n = 0;

	// 작업순서2, run 메소드를 재정의.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			System.out.println("숫자 카운트 스레드4 : " + n);
			n++;
			// 잠시 대기
			try {
				// 1000ms = 1초 와 같다.
				sleep(4000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
