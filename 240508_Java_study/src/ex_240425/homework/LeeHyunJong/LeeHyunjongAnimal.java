package ex_240425.homework.LeeHyunJong;

import java.util.Arrays;

public class LeeHyunjongAnimal { // 클래스로 감싸서 캡슐화
	// 멤버, private 외부에서 못보게 가림. 
	private String name;
	private int age;
	private String[] favoriteFood;

	// getters/setters -> 멤버의 값을 설정 또는 가져오기 가능. 
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
