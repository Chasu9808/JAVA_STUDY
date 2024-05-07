package ex_240507;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;
import util.dto.Person;
import util.eventListener.MyMouseListener;

public class MouseEventTest extends JFrame {
	
	
	// 반복되는 메서드, hashMap에서 꺼내서 위치 잡는 부분을 
	public static void setLocationHashMap(HashMap<String, JLabel> hashMap, Container c) {
		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		
		while (it.hasNext()) {
			String key = it.next(); // 키
			JLabel jLabel = hashMap.get(key); // 값
			jLabel.setSize(50, 20);
			
			// 랜덤한 정수 가지고 오기. 
			int randomNumber = RandomSelectNumber.selectInt(100);
			jLabel.setLocation(30 + randomNumber , 30 + randomNumber );
			c.add(jLabel);
		}
	}
	
	// 반복되는 메서드, hashMap에서 꺼내서 위치 잡는 부분을 
		public static void setLocationClickedHashMap(HashMap<String, JLabel> hashMap,int x, int y) {
			Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
			Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
			
			while (it.hasNext()) {
				String key = it.next(); // 키
				JLabel jLabel = hashMap.get(key); // 값
			
				// 랜덤한 정수 가지고 오기. 
				int randomNumber = RandomSelectNumber.selectInt(5);
//				jLabel.setLocation(30 + randomNumber , 30 + randomNumber );
				jLabel.setLocation(x * randomNumber , y * randomNumber );
			}
		}
	
//pdf19 정답 코드 복붙. 
	// 코드 확인.

	// 생성자, -> JLabel 이라는 참조형 변수를 받는 매개변수 선언. 
	// Hello 라는 문자열 라벨도, 인스턴스 임. 
//	public MouseEventTest(JLabel jaJLabel, JLabel jaJLabel2) {
	public MouseEventTest(HashMap<String, JLabel> hashMap) {

		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널
		Container c = getContentPane();
		
		// 마우스로 클릭시 이벤트 처리기를 붙이기 작업, 
		
		// 방법1) 독립된 클래스 버전
		// 각 요소마다, 이벤트 처리기가 각각 다르다. 
//		c.addMouseListener(new MyMouseListener(jaJLabel));
		
		// 방법2) 익명 클래스 버전
		// 패널에 전체 크기에 마우스 이벤트 리스너 처리기 붙이기. 
		// 예) 패널은, 프레임(윈도우창), 어느 곳을 클릭을 해도 동작하게끔 작업함.
		// 비교, 앞에는 버튼을 클릭시 , 이벤트 처리 되게끔. 
		c.addMouseListener(
				// 익명 클래스, 슈퍼클래스(부모클래스, 부모 타입의 인터페이스)
				new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent event) {
						int x = event.getX(); // 마우스의 클릭 좌표 x
						int y = event.getY(); // 마우스의 클릭 좌표 y
						setLocationClickedHashMap(hashMap,x,y);
//						jaJLabel.setLocation(x, y); // (x,y) 위치로 레이블 이동
//						jaJLabel2.setLocation(x+20, y-30); // (x,y) 위치로 레이블 이동
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}}
				
				);
		
		// 배치 관리자가 없음. 자동 정렬이 안됨. 임의의 위치에 지정이 가능.
		c.setLayout(null);
		
		// jaJLabel 의 가로 , 세로 크기
		
		// hashMap 있는 요소를 꺼내서, 
		// 처음 위치, 크기 지정, 패널에 붙이기
		// 메서드로 만들어서 재사용. 
		setLocationHashMap(hashMap, c);
		
		
//		jaJLabel.setSize(50, 20); // 레이블의 크기 50x20 설정
//		jaJLabel2.setSize(100, 20); // 레이블의 크기 50x20 설정
//		// jaJLabel의 시작 위치. 
//		jaJLabel.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
//		jaJLabel2.setLocation(100, 100); // 레이블의 위치 (30,30)으로 설정
//		// 라벨을 패널에 붙이기. 
//		c.add(jaJLabel);
//		c.add(jaJLabel2);
//		// 윈도우 창의 크기
		setSize(500, 400);
		// 모든 요소를 보열줄지 여부. 
		setVisible(true);
	}

	public static void main(String[] args) {
		// 인스턴스 생성시, 라벨 여기서 추가할 예정. 
		// 인스턴스 멤버, 
		// 레퍼런스, 참조형, 인스턴스 -> 집주소 , 0x100
		JLabel la = new JLabel("Hello"); // "Hello" 레이블
		// 레퍼런스, 참조형, 인스턴스 -> 집주소 , 0x200
		JLabel la2 = new JLabel("오늘 뭐 먹지?"); // "Hello" 레이블
		JLabel la3 = new JLabel("찜닭"); // "Hello" 레이블
		JLabel la4 = new JLabel("설렁탕"); // "Hello" 레이블
		JLabel la5 = new JLabel("미역국"); // "Hello" 레이블
		// 인스턴스 생성 , A a = new A();, 사용하는 코드, 
		
		// 5개를 담아서 전달 하는 방법 대해서 모색 1) HashMap, 2) ArrayList 
		// 1)HashMap
		HashMap<String,JLabel> hashMap = new HashMap<String, JLabel>();
		// 추가, put 
		hashMap.put("label1", la);
		hashMap.put("label2", la2);
		hashMap.put("label3", la3);
		hashMap.put("label4", la4);
		hashMap.put("label5", la5);
		
		
		MouseEventTest mouseEventTest = new MouseEventTest(hashMap);

	}

}

