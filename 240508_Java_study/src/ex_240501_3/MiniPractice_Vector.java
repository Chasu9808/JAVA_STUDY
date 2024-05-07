package ex_240501_3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

import util.CollectionUtils;

public class MiniPractice_Vector {

	// 함수로 분리하기.
	public static void recommendFood(Scanner scanner, Vector<Person> vector) {
		while (true) {
			System.out.println("=================================");
			System.out.println("오늘 점심 메뉴 무엇을 먹을까요 프로젝트 벡터 버전");
			System.out.println("1. 메뉴 입력, 2. 메뉴 출력, 3. 검색하기 , 4. 멤버 삭제하기, 5. 멤버의 메뉴 삭제하기, 6. 종료하기. ");
			System.out.println("=================================");

			// 순서2-2, 문자열로 날씨를 담을 변수 지정.
			String weather = scanner.next();

			if (weather.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (weather.equals("1")) {
				System.out.println("이름 입력>>");
				String userName = scanner.next();
				System.out.println("메뉴 입력(예_콤마로 분리)라면,김밥>>");
				String foodList = scanner.next();

				// 메뉴 입력 : 라면,김밥,국수
				// st 인스턴스(객체, 수납도구) 안에는 , 콤마를 기준으로 나누어진 문자열 조각이 있다.
				//			1행   2행   3행
				// st 안에 , 라면  김밥  국수 
				StringTokenizer st = new StringTokenizer(foodList, ",");
				Vector<String> foodListVector = new Vector<String>();
				//st.hasMoreTokens() 의 시작 위치, 0행이라고 표현. 
				while (st.hasMoreTokens()) { // 0행 다음은 1행이죠? 있음.
					// st.nextToken() : 1행을 가지고 와요. 
					String food = st.nextToken();
					foodListVector.add(food);
				}

				Person person = new Person(userName, foodListVector);
				vector.add(person);

				continue;
			} else if (weather.equals("2")) {
				System.out.println("메뉴 출력>>");
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					Vector<String> person_foodList = person.getFoodList();
					for (int j = 0; j < person_foodList.size(); j++) {
						System.out.println(person.getName() + "의 메뉴 리스트 : " + (j + 1) + "번 " + person_foodList.get(j));
					}

				}
				continue;
			} else if (weather.equals("3")) {
				System.out.println("검색하기예)라면>>");
				String searchName = scanner.next();
				Vector<String> search_list = new Vector<String>();
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					Vector<String> person_foodList = person.getFoodList();

					for (int j = 0; j < person_foodList.size(); j++) {
						if (person_foodList.get(j).equals(searchName)) {
							search_list.add(person.getName() + "의 메뉴: " + person_foodList.get(j));
						}
					} // end for 안
				} // end for 밖

				if (!search_list.isEmpty()) {
					for (int i = 0; i < search_list.size(); i++) {
						System.out.println("검색된 메뉴 " + (i + 1) + " " + search_list.get(i));
					}
				} else {
					System.out.println("검색 메뉴가 없습니다.");
				}
				continue;
			} else if (weather.equals("4")) {
				System.out.println("이름으로 삭제하기 예)이상용>>");
				String deleteName = scanner.next();
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					if (person.getName().equals(deleteName)) {
						vector.remove(i);
						System.out.println("삭제 완료");
					}
				} // end for 밖

				continue;
			} else if (weather.equals("5")) {
				System.out.println("멤버 이름 입력>>");
				String deleteMemberName = scanner.next();
				System.out.println("삭제할 메뉴 입력>>");
				String deleteMenu = scanner.next();
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					if (person.getName().equals(deleteMemberName)) {
						for (int j = 0; j < person.getFoodList().size(); j++) {
							if (person.getFoodList().get(j).equals(deleteMenu)) {
								System.out
										.println(person.getName() + "의 메뉴 " + person.getFoodList().get(j) + "를 삭제 했음.");
								person.getFoodList().remove(j);
							} // 사람도 일치, 메뉴도 일치 한다면, if
						} // end for 안,
					} // if, 입력한 사람과 같다면
				} // end for 밖

				continue;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Vector<Person> verStrings = new Vector<Person>();
		recommendFood(scanner, verStrings);

	}
}
