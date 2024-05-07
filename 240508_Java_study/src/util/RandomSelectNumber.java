package util;

import java.util.Random;

public class RandomSelectNumber {
	// boundary 경계 숫자를 받으면, 
	// 경계숫자 포함해서 0 ~ boundary 까지  
	public static int selectInt(int boundary) {
		// 랜덤한 숫자 0 ~ 4 중에서, 하나 선택 후, 임시 변수에 담아서,
		// 정의
		Random random = new Random();
		// 함수 사용. random.nextInt(5); , 5미만의 정수, 랜덤 뽑기.
		int randomNumber = random.nextInt(boundary) ;
		return randomNumber;

	}

}
