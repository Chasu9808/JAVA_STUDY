package ex_240502;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// iterator 반복자 도구 이용해서, 누적 합 구해보기.
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		// Wrapper 클래스 이용해도 되지만, jdk 해서, 오토 박싱(기본형 -> 참조형) 형변환 해준다.
		intArrayList.add(100);
		intArrayList.add(200);
		intArrayList.add(300);
		intArrayList.add(400);

		// iterator 정의하기.
		Iterator<Integer> iterator = intArrayList.iterator();
		// 반복문 패턴 이용해서, 출력해보기.
		// 시작 위치, 0행으로 잡고, 각 요소를 1행, 2행, 3행, 이런식으로 접근하기.
		// iterator.hasNext() : 0행에서, 다음 요소 1행이 있니?
		
		
		// 반복문 패턴 이용해서, 누적합 구해보기.
		// Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		while (iterator.hasNext()) {
			// 1행의 요소를 가지고 온다.
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
//			int n = iterator.next();
//			System.out.println("n 값이 들어있니 : " + n);
			// 자동 언방식, 참조형 -> 기본형 
			sum += integer;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
