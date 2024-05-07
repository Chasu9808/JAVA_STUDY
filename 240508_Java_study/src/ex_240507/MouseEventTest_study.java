package ex_240507;

import java.awt.*;
import java.awt.event.*;
import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.*;

import util.RandomSelectNumber;

public class MouseEventTest_study extends JFrame {
	
	
	// 메서드 생성하기
	public static void setLocationHashMap(HashMap<String, JLabel> hashMap, Container c) {
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		
		
		
		while (it.hasNext()) {
			String key = it.next(); // 키
			JLabel jLabel = hashMap.get(key); // 값
			jLabel.setSize(50, 20);
			// 랜덤한 정수 가지고 오기.
			int randomNumber = RandomSelectNumber.selectInt(100);
			jLabel.setLocation(30+randomNumber, 30+randomNumber);
			c.add(jLabel);
	}
	}
	
	// 메서드 생성하기
		public static void setLocationclickedMap(HashMap<String, JLabel> hashMap) {
			Set<String> keys = hashMap.keySet();
			Iterator<String> it = keys.iterator();
			
			
			
			while (it.hasNext()) {
				String key = it.next(); // 키
				JLabel jLabel = hashMap.get(key); // 값
				// 랜덤한 정수 가지고 오기.
				int randomNumber = RandomSelectNumber.selectInt(100);
				jLabel.setLocation(30+randomNumber, 30+randomNumber);
		}
		}
	
	
	// 생성자 MouseEventTest_study -> JLabel 참조형 변수를 받는 매겨변수 선언.
	// Hello 라는 문자열 라벨도, 인스턴스
	public MouseEventTest_study(HashMap<String, JLabel> hashMap) {
			
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널
		Container c = getContentPane();
		
		// 독립된 클래스 버전, 
//		c.addMouseListener(new MyMouseListener_study(jLabel));
		
		// 익명클래스 버전 진행
		c.addMouseListener(
				new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent event) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent event) {
						int x = event.getX(); // 마우스의 클릭 좌표 x
						int y = event.getY(); // 마우스의 클릭 좌표 y
//						jLabel .setLocation(x, y); // (x,y) 위치로 레이블 이동
//						jLabel2 .setLocation(x+50, y+50); // (x,y) 위치로 레이블 이동
						setLocationclickedMap(hashMap);
						
					}

					@Override
					public void mouseReleased(MouseEvent event) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent event) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent event) {
						// TODO Auto-generated method stub
						
					}}
				
				);
		
		
		// 배치관리자 x 자동정렬x, 위치 지정가능
		c.setLayout(null);
		
		setLocationHashMap(hashMap, c);
//		
//		jLabel.setSize(50, 20); // 레이블의 크기 50x20 설정
//		jLabel.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
//		jLabel2.setSize(50, 20); // 레이블의 크기 50x20 설정
//		jLabel2.setLocation(40, 40); // 레이블의 위치 (30,30)으로 설정
//		c.add(jLabel);
//		c.add(jLabel2);
		setSize(200, 200);
		setVisible(true);
	
	}
		
	public static void main(String[] args) {
		// 인스턴스 새성 시, 라벨 여기서 추가할 예정
		// 인스턴스 멤버,
		JLabel la = new JLabel("Hello"); // "Hello" 레이블
		JLabel la2 = new JLabel("개"); // "Hello" 레이블
		JLabel la3 = new JLabel("김"); // "Hello" 레이블
		JLabel la4 = new JLabel("치"); // "Hello" 레이블
		JLabel la5 = new JLabel("찌"); // "Hello" 레이블
		
		HashMap<String, JLabel> hashMap = new HashMap<String, JLabel>();
		hashMap.put("label1", la);
		hashMap.put("label2", la2);
		hashMap.put("label3", la3);
		hashMap.put("label4", la4);
		hashMap.put("label5", la5);
		
		MouseEventTest_study mouseEventTest_study = new MouseEventTest_study(hashMap);
		
//		MouseEventTest_study mouseEventTest_study = new MouseEventTest_study(la,la2);
	}

}