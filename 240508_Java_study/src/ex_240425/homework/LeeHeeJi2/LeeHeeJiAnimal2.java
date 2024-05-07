package ex_240425.homework.LeeHeeJi2;

import java.util.Arrays;

public class LeeHeeJiAnimal2 {

		
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

}