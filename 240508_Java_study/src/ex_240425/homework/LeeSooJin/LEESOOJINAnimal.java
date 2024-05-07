package ex_240425.homework.LeeSooJin;

import java.util.Arrays;

public class LEESOOJINAnimal {//클래스로 감싸서 캡슐화
	
	//멤버
	private String name;
	private int age;
	private String[] favoriteFood;
	private String kindOf;
	private String color;
	
	
	//getter/setter  
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
	
	

	//메서드 toString, -> 해당 멤버의 값을 다 출력해주는 메서드,
	//Object 최고의 부모 클래스 여기사 toString 메서드가 있다.
	
	//오버라이드, 네어체이션이라고도 부르고,
	// 기능은 컴파일러에게 나 이 메서드 재정의했으니 나중에 실행할 때, 확인 잘 해줘라고 메세지 남김. 
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































