package ex_240425.homework.KangSeungBae;

public class KangSeungBaeTest {

	public static void main(String[] args) {

		KangSeungBaeDog dog1 = new KangSeungBaeDog();
		dog1.setName("루키");
		dog1.setAge(2);
		String[] catFoodList = { "개껌", "사료", "김치찌개" };
		dog1.setFavoriteFood(catFoodList);
		dog1.setPlace("루키집");
		String catInformation = dog1.toString();
		System.out.println("고양이 정보 : " + catInformation);
		dog1.moveAction("호다닥");
		dog1.speakSound("멍");
		System.out.println("고양이가 사는 곳 : " + dog1.getPlace());

	}

}
