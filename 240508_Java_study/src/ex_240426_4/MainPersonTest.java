package ex_240426_4;

public class MainPersonTest {

	public static void main(String[] args) {
		//인스턴스 만들기. 
		// 받는 타입 : Person , 부모
		// 생성자 호출의 타입 : Student, 자식
		// ㄷ ㅎ ㅅ ,다형성
		Person lsy = new Student();
		
		//
		Person lcs = new StudentWorker();
		
		// lsy는 타입이 뭐죠? Person, Student
		// lcs는 타입이 뭐죠? Person, StudentWorker
		
		// lsy 는 현재 상황에서, 보이는 메서드는 어디 까지 일까요?
		// 정답, 오현제, Person 부모 메서드까지입니다. 
		// 즉, Student 의 study 가 안보임.
		// Student 의 study 를 볼려고 함. 
		// 어떻게 할까요? 정답, 다운캐스팅. 
		// 정답, 이한솔, 인스턴스 오브 , instanceof 
		// 결론, 어떻게 사용하는지? ㅁ ㄷ,m
		// 정답, 모델, 타입이 일치시키고 작업을 함. 
		// 다운 캐스팅 그냥 하면 안됩니다. 
		// 유효성 타입 체크 
		if (lsy instanceof Student) {
			// 타입 맞는지 확인 후, 다운 캐스팅해야함. 
			// 왜? 문법상 체크상에는 표가 안남. 
			// 실행시점에서 클래스캐스트 예외가 발생해서. 
			Student lsyStudent = (Student)lsy;
			lsyStudent.study();
		}
		
		// 부모 클래스 중에서, 기능이 4개 있음. 
		// 말하기, 먹기, 걷기, 잠자기 
		// 재정의, Student , 자식, 말하기 재정의. 
		// 부모에도 , 말하기 기능. 
		// 자식에도 , 말하기 기능. 
		// 이상황에서 lsy는 -> 부모 의 말하기 기능,? 자식의 말하기 기능?
		// 사용할까요? 홍사자 정답, 자식. (가상 메서드)
		// 상속을 받았다면, 재정의 할 때, 자식 메서드가 우선임. 
		
		lsy.speak();
		

	}

}







