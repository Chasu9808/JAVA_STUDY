package ex_240423;

public class KoreanFood {
	// 설계도면으로 사용할 예정. 
	// 객체 -> 수납도구 -> 멤버와 함수를 가지고 있다. 
	// 멤버, 메서드를 가지고 있다. 
	private String foodName;
	private int foodPrice;
	private String foodPlace;
	
	// 전역으로 사용이되고, 상수로 사용함. -> 전역 상수
	private static final String projectName = "오늘 점심 메뉴 선정 프로젝트";
	
	// 방법1
	// getter/setter 라는 것을 추가하기. 
	// 반자동( 코드 스니펫으로 자동 만들기.)
	// 우클릭 -> Source 메뉴 -> Generate getters and setters.. 클릭. 
	// 멤버를 선택하는 창 나옴. -> 모두 선택 -> 게터 세터를 모두 선택하자. 
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodPlace() {
		return foodPlace;
	}
	public void setFoodPlace(String foodPlace) {
		this.foodPlace = foodPlace;
	}
	
	
	// 방법2, lombok 라이브러리 이용. 
	// 메모리상에, getters, setters, toString, Data, 등. 

	// 생성자 만들기. 클래스 설계도면으로 사용하죠. 
	// 객체(인스턴스)를 생성해주는 역할,
	// 단순, 복수, 
	// 매개변수가 3개인 생성자로 만들기. 
	// 참고로 생성자 기본 문법은, 클래스명과 동일하고, 메서드와는 다름.
	
	// 반자동으로 생성.
	// 우클릭 -> Source 메뉴 -> Generate Constructor Field... 클릭.
	// 창 
	
	public KoreanFood(String foodName, int foodPrice, String foodPlace) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodPlace = foodPlace;
	}
	
	// static 전역 메서드 만들기, 인스턴스 안만들고, 
	// 해당 클래스명으로 바로 접근이 가능하다. 
	// 이유? 클래스가, 이미 실행 시점에, 메모리에 로드가 되어서, 
	public static String showStaticMember() {
		return projectName;
		
	}
	
	// 귀찮으니, 다 출력하는 함수 만들기. 인스턴스 메서드 방법으로 
	public void showInfo() {
		System.out.println("오늘 점심 메뉴 : " + this.foodName + ", 가격 : " + this.foodPrice);
		System.out.println("장소 : " + this.foodPlace);
	}
	
	
	
	
}
