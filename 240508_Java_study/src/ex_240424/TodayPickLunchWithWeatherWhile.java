package ex_240424;

import java.util.Scanner;

public class TodayPickLunchWithWeatherWhile {
	
	// 메인 메뉴 출력 해주는 함수 만들기. 
	public static void showMainMenu() {
		System.out.println("=================================");
		System.out.println("오늘 점심 메뉴 무엇을 먹을까요 프로젝트");
		System.out.println("날씨가 어떤가요? 1.비 2.흐림 3.맑음 4.바람 5.기타");
		System.out.println("날씨를 적어주세요. 가정");
		System.out.println("=================================");
	}
	
	public static void selectFood(int weather) {
		switch (weather) {
		case 1: 
			System.out.println("비가 오는 경우 삼선우동 추천합니다.");
			break;
		case 2: 
			System.out.println("흐림 일 경우 밀면 추천합니다.");
			break;
		case 3: 
			System.out.println("맑음 일 경우 된장찌개 추천합니다.");
			break;
		case 4: 
			System.out.println("바람이 많이 부는 경우 돼지국밥 추천합니다.");
			break;
		case 5: 
			System.out.println("메뉴 추천 종료합니다.");
//			scanner.close();
			break;
		default:
			System.out.println("디폴트 비빔밥 추천합니다.");
		}
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("6번 메뉴 추천 하기, 5번 종료하기");
		//상태 변수 , isgoing
		String isgoing = "Y";
		while (!isgoing.equals("Y")) {
			showMainMenu();
			selectFood(n);
		}
		

	}

}
