package ex_240426;

class Sample {
	public int a; 
	private int b = 100;
	int c;
	public int getB() {
		return b;
	}
	
	//전역 만 확인 해보기.  -> 공용
	static int tvChannel = 3; // 차달남, 
	public static void channelUp() {
		tvChannel++;
	}
	public static void channelDown() {
		tvChannel--;
	}
	
	
}

public class AccessTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
		//sample.b = 3;
		int result = sample.getB();
		System.out.println("result : " + result);
		
		// 	public int a; 
		// 값 직접 접근이 가능해서, 읽기, 쓰기도 됨. 
		// 직접쓰기
		sample.a = 200;
		// 직접 읽기
		System.out.println("sample.a 의 값 : " + sample.a);
		
		// 이상용씨, 강루키, 홍사자, 프로젝트 인해서 합숙중, 공용 거실에 쉬는 중. 
		Sample lsy = new Sample();
		Sample krk = new Sample();
		Sample hsj = new Sample();
		System.out.println("이상용씨가 티비를 " +lsy.tvChannel +"번 채널 시청중");
		System.out.println("강루키 씨가 UFC 를 보고싶어서 채널 1올렸음." );
		// 강루키 씨가 채널을 변경. 
		Sample.channelUp();
		System.out.println("이상용씨와, 강루키씨, 홍사자는 같이 채널 "+lsy.tvChannel +"번 채널 시청중");

	}

}





