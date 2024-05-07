package ex_240425.homework.MoonSuYeon;

public class MoonSuYeonAnimal {

	public static void main(String[] args) {
		MoonSuYeonDog dog1 = new MoonSuYeonDog();
		dog1.setName("멍멍이");
		dog1.setAge(3);
		dog1.setPlace("부모님집에");
		String[] dogFoodList = {"사료", "고구마", "고기"};
		dog1.setFavoriteFood(dogFoodList);
		String dogInformation = dog1.toString();
		System.out.println("강아지 정보: " + dogInformation);
		dog1.moveAction("보자마자 뛰쳐나온다");
		dog1.speakSound("멍멍멍~");
		System.out.println("강아지가 사는곳: " + dog1.getPlace());

	}

}
