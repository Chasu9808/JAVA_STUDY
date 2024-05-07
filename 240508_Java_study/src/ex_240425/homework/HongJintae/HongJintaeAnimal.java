package ex_240425.homework.HongJintae;

public class HongJintaeAnimal {
	private String name;
	private int age;
	private String food;
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "Lion [name=" + name + ", age=" + age + ", food=" + food + "]";
	}
	
	
	public void speakSound(String sound) {
		System.out.println("울음소리 : " + sound);
		
	}
	
	public void moveAction(String Action) {
		System.out.println("행동 : " + Action);
	}
	
}
