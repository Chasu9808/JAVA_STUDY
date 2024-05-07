package ex_240502_mini;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import util.LocalDateTimeMake;
import util.dto.Person;
import util.service.HashMapUtils;

public class Contact_MiniProject_HashMap {

	// 함수로 분리하기.
	// 함수의 파라미터 , 1) Scanner scanner, 콘솔에서 입력받은 정보를 임시 변수에 담을 용도
	// 2)HashMap<String, Person> hashMap : key : 사람이름, value : Person 타입(클래스)
	//예) "이상용" : Person("이상용","01012345678","2024-05-03 09:32:00")
	//예) "이상용2" : Person("이상용2","01012345678","2024-05-03 09:32:00")
	//예) "이상용3" : Person("이상용3","01012345678","2024-05-03 09:32:00")
	public static void recommendFood(Scanner scanner, HashMap<String, Person> hashMap) {
		while (true) {
			// 6번 입력시, break 만나서, 프로그램 종료. 
			
			System.out.println("=================================");
			System.out.println("연락처 프로그램 만들기.HashMap 버전");
			System.out.println("1. 입력, 2. 출력(최신날짜순 정렬), 3. 검색 , 4. 삭제, 5. 랜덤 멤버 뽑기, 6. 종료하기. ");
			System.out.println("=================================");

			// weather = 메인 메뉴의 번호를 담는 임시 변수. 
			String weather = scanner.next();

			if (weather.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (weather.equals("1")) {
				//1번 누를시, 한 유저씩 등록함. 
				System.out.println("이름 입력>>");
				// 콘솔에 입력한 사용자 이름을 읽어서, userName 담기.
				String userName = scanner.next();
				// 이름을 입력하면, 그다음 출력문으로 넘어감. 
				
				System.out.println("연락처입력(예:01012345678)>>");
				// 콘솔에 입력한 사용자 연락처을 읽어서, contact 담기.
				String contact = scanner.next();
				// 시간은 특정 함수를 만들어서 이용. 
				// regDate = "yyyy-MM-dd hh:mm:ss";
				String regDate = LocalDateTimeMake.now();

				// Person 클래스의 생성자 호출해서, 인스턴스를 만들기. 
				Person person = new Person(userName, contact, regDate);
				// hashMap, 키: "이상용",값: Person의 인스턴스 을 담기. 
				hashMap.put(userName, person);

			} else if (weather.equals("2")) {
				System.out.println("연락처 출력>>");
				//역순 정렬,
				HashMap<String, Person> hashMap2 = HashMapUtils.sortReverseElem(hashMap);
				//출력 기능 , 함수분리
				HashMapUtils.showElem(hashMap2);

			} else if (weather.equals("3")) {
				System.out.println("검색하기 예:이상용>>");
				String searchName = scanner.next();
				// 검색된 Person 을 담기 위한, 임시 맵. 
				HashMap<String, Person> search_list = new HashMap<String, Person>();
				//검색 기능 , 함수분리, 인자값에 전달 준비물 
				// 1) hashMap : 모든 연락처가 들어가 있다. 소멸안함. 인스턴스 -> 집주소
				// 2) searchName : 검색할 이름.  소멸안함. 인스턴스 -> 집주소
				// 집주소를, 메서드 인자값으로 이용해도, 소멸안함. 
				search_list = HashMapUtils.findElem(hashMap, searchName);

				// 조건이 있다면, search_list : 비어 있지 않다. -> 들어 있다. 
				//순서1) search_list.isEmpty() -> 비어 있니? false
				// 순서2) !false -> true
				
				// 순서1) search_list.isEmpty() -> 비어 있니? true
				// 순서2) !true -> false
				if (!search_list.isEmpty()) {
					System.out.println("검색된 사용자 : ");
					//출력 기능 , 함수분리
					HashMapUtils.showElem(search_list);
				} else {
					System.out.println("사용자가 없습니다.");
				}

			} else if (weather.equals("4")) {
				System.out.println("이름으로 삭제하기 예)이상용>>");
				String deleteName = scanner.next();
				//삭제 기능 , 함수분리
				// 1) hashMap : 모든 연락처가 들어가 있다. 소멸안함. 인스턴스 -> 집주소
				// 2) deleteName : 삭제할 이름.  소멸안함. 인스턴스 -> 집주소
				// 집주소를, 메서드 인자값으로 이용해도, 소멸안함. 
				HashMapUtils.deleteElem(hashMap, deleteName);
				
			} else if (weather.equals("5")) {
				System.out.println("랜덤 멤버 뽑기>>");
				//랜덤 기능 , 함수분리
				// 이상용2번이 랜덤하게 뽑힘. 
				String randomPickedMember = HashMapUtils.randomElem(hashMap);
				System.out.println("======랜덤 멤버 출력 3초전 =====");
				// 일정시간 카운트 다운 , 클래스로 분리. 
				TimerThread th = new TimerThread(hashMap, randomPickedMember);
				th.start();
//				System.out.println("이름 : "+hashMap.get(randomPickedMember).getName());
//				System.out.println("연락처 : "+hashMap.get(randomPickedMember).getContact());
//				System.out.println("등록일 : "+hashMap.get(randomPickedMember).getRegDate());
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Person> hashMapContact = new HashMap<String, Person>();
		recommendFood(scanner, hashMapContact);

	}

}
