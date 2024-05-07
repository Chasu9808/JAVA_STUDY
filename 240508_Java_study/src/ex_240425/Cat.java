package ex_240425;

public class Cat extends Animal{
	private String place;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	//생성자 만들기. 
	// Cat 의 부모 클래스는 Animal 
	// 자식은 부모 꺼 사용할려면, 부모꺼 먼저 초기화 해야 한다. 
	public Cat() {
		// super() = Animal() 호출하는 것과 동일함. 
		super(); // 부모의 기본 생성자를 호출 하는 키워드
		// TODO Auto-generated constructor stub
	}

	// 자식 클래스 Cat , 생성자 
	public Cat(String name, int age, String[] favoriteFood, String place) {
		// super(name, age, favoriteFood); => Animal(name, age, favoriteFood);
		super(name, age, favoriteFood);
		this.place = place;
	}
	
	// 정보를 출력하는 함수 만들기. 
	public void showInfo() {
		System.out.println("이름 : "+ this.getName());
		System.out.println("나이 : "+ this.getAge());
		for(String likeFood: this.getFavoriteFood()) {
			System.out.println("좋아하는 음식 : " + likeFood);
		}
		System.out.println("사는 곳  : "+ this.getPlace());
		
		
	}
	
	

}






