package ex_240423_3;

public class TestClass1 {

	public static void main(String[] args) {
		int _dd;
//		int @dd2;
//		int !dd3;
		
		byte b1 = 127;
		int i1 = 129;
		// 강제로 형변환, 방법. () 캐스팅 연산자.
		// 큰 타입 형, 작은 타입 형.
		// 실제로 사용할 변수의 타입을 넉넉히 잡아요. 
		byte b2 = (byte)i1;
		System.out.println("b2 : " + b2);

	}

}
