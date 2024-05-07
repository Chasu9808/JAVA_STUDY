package ex_240425.homework.Limchasu;

import java.util.Arrays;

public class LimchasuAnimal {
	
	private String name;
	private int age;
	private String[] favoritefood;
	
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
	public String[] getFavoritefood() {
		return favoritefood;
	}
	public void setFavoritefood(String[] favoritefood) {
		this.favoritefood = favoritefood;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", favoritefood=" + Arrays.toString(favoritefood) + "]";
	}
	
	public void speakSound(String sound) {
		System.out.println("사운드 :" + sound);
	}
	public void moveAction(String action) {
		System.out.println("움직임 :" + action);
	}

}