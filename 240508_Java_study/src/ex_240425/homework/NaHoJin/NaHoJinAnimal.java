package ex_240425.homework.NaHoJin;

import java.util.Arrays;

public class NaHoJinAnimal {//클래스로 감싸 캡슐화
	// 멤버 , private 외부에서 못보게 가림.
	private String name;
	private int age;
	private String[] favoriteFood;
	
	// getter /setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(String[] favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	// 메소드 , toString -> 해당멤버의 값을 다 출력해주는 메서드,
		//  object , 최고 부모 클래스 여기에 toString 메서드가 있따.
		
		// 중요한 사실 , 모든 클래스는 암묵적으로 Object 라는 부모클래스를 다 상속 받고있음. 전부
		
		// 여기서 , 메서드는 출력을 의미 없는 메모리 위치 주소값을 출력 해줘서 , 사용안함
		// 그래서 , 이 메소드를 재정의해서 실제 데이터가 출력이 되게 기능 변경
		// 자동으로 소스코드를 이요해 만든 기능이 실제데이터를 해주는 기능 
		
		//@Override, 애너테이션
		// 기능은 , 컴파일러에게 , 나 이 메소드 재정의 했으니 나중에실행할 때 확인 잘해달라고 메세지 남김.
		
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", favoriteFood=" + Arrays.toString(favoriteFood) + "]";
	}
	
	public void speakSound(String sound) {
		System.out.println("사운드 : " + sound);
	}
	
	public void moveAction(String action) {
		System.out.println("움직임 : " + action);
		
	}

}
