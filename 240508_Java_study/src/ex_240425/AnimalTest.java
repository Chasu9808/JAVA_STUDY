package ex_240425;

public class AnimalTest {

	public static void main(String[] args) {
		// 고양이 만들기. 
		Cat cat1 = new Cat();
		// 고양이 정보도 설정. 
		cat1.setName("모찌");
		cat1.setAge(2);
		String[] catFoodList = {"츄르","참치캔","생선"};
		cat1.setFavoriteFood(catFoodList);
		cat1.setPlace("정섭씨 집에");
		// 고양이 정보 출력하기. 
		String catInformation = cat1.toString();
		System.out.println("고양이 정보 : " + catInformation);
		// 고양이 기능 출력하기.
		cat1.moveAction("우다닥 다닌다.");
		cat1.speakSound("야옹~~~");
		System.out.println("고양이가 사는 곳 : " + cat1.getPlace());
		
		// 다형성.
		// 원래 : A a = new A();
		// 다형성 부모 타입으로 받기 : SuperA a1 = new A();
		// 다형성으로 담을 때 좋지만, 다시 원래의 형으로 돌아갈 때는 
		// 다운 캐스팅을 하여야 한다. 
		
		// 큰 타입 = 작은 타입 : 업 캐스팅
		Animal ani1 = new Cat();
		Animal ani2 = new Dog();
		
		// 형변환을 하기전에 그 타입 맞는지 검사 : instanceof 연산자 이용하기. 
		// 기본 문법 ,
		// 작은타입 instanceof 큰타입 => true, false 반환 함. 
		// 실무에서는 , 처음 부터 담을 때, 제너릭등을 이용해서, 
		// 모델 타입을 맞춰서 넣습니다. 
		// 그러면, 꺼내서 사용시, 추가로 유효성 타입 검사를 할 필요가 없음.
		// 결론, 담을 때 모델별로 (같은 타입)으로 담아라.
		
		if(ani1 instanceof Cat) {
			System.out.println("ani1 은 Cat 타입이 맞습니다.");
			// 작은 타입 = 큰 타입 : 다운 캐스팅 
			Cat catTest = (Cat)ani1;
			catTest.showInfo();
		} else {

			System.out.println(" Cat 타입이 아닙니다.");
		}
		
		// 작은 타입 = 큰 타입 : 다운 캐스팅 
//		Cat catTest = (Cat)ani2;
		// 잘못 변환 하는 실수 
//		catTest.showInfo();
		
		String [] catFoodLiStrings = {"참치캔","사료"};
		
		Cat cat2 = new Cat("야옹이", 3, catFoodLiStrings, "상용집");
		cat2.showInfo();
		
		Animal [] animals = new Animal[17];
		
		
		

	}

}



