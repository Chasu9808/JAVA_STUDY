package ex_240425.homework;

import ex_240425.homework.HongJintae.HongJintaeLion;
import ex_240425.homework.KangSeungBae.KangSeungBaeDog;

public class HomeworkTest {

	public static void main(String[] args) {
		// 숙제 받아서 확인 해보기. 
		// Object : 최고 부모 클래스 -> ALL
		Object [] testMemberObjects = new Object[17];
		
		// 샘플 홍사자
		HongJintaeLion hongJintaeLion = new HongJintaeLion();
		hongJintaeLion.setName("홍사자");
		
		// 샘픔 강루키
		KangSeungBaeDog kangSeungBaeDog = new KangSeungBaeDog();
		kangSeungBaeDog.setName("강루키");
		
		testMemberObjects[0] = hongJintaeLion;
		testMemberObjects[1] = kangSeungBaeDog;
		
		for (Object object : testMemberObjects) {
			Object object2 = object;
			// 원래의 본인의 타입으로 다운 캐스팅, 부모 타입에서, 자식 타입으로 타입 일치 하겠다. 
			// 다운 캐스팅 문법
			// 작은 타입 | 작은 타입의 참조형 변수 = (작은 타입) 큰 타입의 참조형 변수
			if(object2 instanceof HongJintaeLion) {
				HongJintaeLion test = (HongJintaeLion)object2;
				System.out.println(test.getName());
			} else if (object2 instanceof KangSeungBaeDog) {
				KangSeungBaeDog test = (KangSeungBaeDog)object2;
				System.out.println(test.getName());
			}
		}

	}

}




