package ex_240501_3;

import java.util.Vector;

public class Person {
	
	public Person(String name, Vector<String> foodList) {
		super();
		this.name = name;
		this.foodList = foodList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vector<String> getFoodList() {
		return foodList;
	}
	public void setFoodList(Vector<String> foodList) {
		this.foodList = foodList;
	}
	private String name;
	private Vector<String>foodList;
}
