package ex_240425.homework.moonjungseob;

import java.util.Arrays;

public class MoonJungSeobAnimal {
	private String name;
	private int age;
	private String[] favoriteFood;
	
	
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
	public void canDoit(String doit) {
		System.out.println("잘하는거 : " + doit);
	}
	public void sleepTime(String sleep) {
		System.out.println("잠자는 시간 : " + sleep);
	}
	}
	