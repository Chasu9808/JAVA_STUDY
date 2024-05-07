package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMake {
	// 스태틱 함수, 이용법 : 클래스명.함수명 
	// 예) LocalDateTimeMake.now() , 반환 타입 : String
	// 함수가 실행 후 출력하는 포맷팅 -> "yyyy-MM-dd hh:mm:ss"
	public static String now() {
		
		// 년,월,일, 시,분,초 -> 포맷팅도 다하게끔.
		// 시스템에서, 현재 시각을 의미. LocalDateTime.now() , 년,월,일, 시,분,초 
		LocalDateTime now = LocalDateTime.now();
		// 포맷팅
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String nowString = now.format(dateTimeFormatter);
		return nowString;
	
}
}
