package ex_240423_2;

public class Sports {

	public static void main(String[] args) {
		// 메인, 실행하는 클래스 사용. 
		// 지금은 생성자가 매개변수가 없는 기본 생성자입니다. 조금 불편함. 
		Swimming swim1 = new Swimming();
		swim1.setSportsMember("이상용");
		swim1.setSportsName("수영");
		swim1.setSportsSeason("사계절");
		
		// 메서드 호출 방법. 
		// 인스턴스 메서드, 
		swim1.showInfo();
		
		// toString 방법으로 출력. 
		System.out.println(swim1.toString());
		
		// 전역 상수, 전역 메서드 사용해보기. 
		System.out.println(Swimming.COMMENT);
		String resultString = Swimming.COMMENT;
		System.out.println("코멘트 : " + resultString);
		
		Swimming.showComment();
		

	}

}
