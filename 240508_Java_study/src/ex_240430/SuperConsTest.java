package ex_240430;

class A {
	 // 작업 순서4, 본인  생성자를 호출
	// 출력 순서1,
	// jvm , 생성자에서 매개변수 타입이 선언이 되었다면
	// 기본 생성자 안만들어준다.
	public A() {
		System.out.println("생성자 A() 호출");
	}
	public A(String name) {
		System.out.println("생성자 A() 호출");
	}
	public A(String name, int age) {
		System.out.println("생성자 A() 호출");
	}
}
class B extends A{
	
	 // 작업 순서3, A()  생성자를 호출	
	public B() {
		super();
		// 출력 순서2
		System.out.println("생성자 B() 호출");
	}
	public B(String name) {
		super();
		// 출력 순서2
		System.out.println("생성자 B() 호출");
	}
}
class C extends B{
	 // 작업 순서2, B()  생성자를 호출
	public C() {
		super();
		// 출력 순서3
		System.out.println("생성자 C() 호출");
	}
	public C(String name) {
		// super() , super(x) 누가 호출 :? 기본, 
		super();
		// 출력 순서3
		System.out.println("생성자 C() 호출");
	}
}

public class SuperConsTest {
	
	public static void main(String[] args) {
	 // 작업 순서1, C()  생성자를 호출
		C c = new C("lsy");

	}

}






