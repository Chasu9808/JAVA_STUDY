package ex_240425.homework.NamGwiYeon;

import java.util.Arrays;

public class NamGwiYeonAnimal {
	
	private String name;
	private int age;
	private String[] lovefood;
	
	
	//getter / setter 값 가져옴
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
	public String[] getLovefood() {
		return lovefood;
	}
	public void setLovefood(String[] lovefood) {
		this.lovefood = lovefood;
	}
	
	
	
	public void speakSound(String sound) {
		System.out.println("동물의 울음소리 : "+sound);
	}
	
	public void action(String move) {
		System.out.println("동물의 움직임 : "+move);
	}
	
	//toString > object 클래스 속 메소드였다.  
	@Override //애너테이션, 컴파일러에게 재정의했으니 확인 해줘라고 메세지 남김
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", lovefood=" + Arrays.toString(lovefood) + "]";
	}

}
