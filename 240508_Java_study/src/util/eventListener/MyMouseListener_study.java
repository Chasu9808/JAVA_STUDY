package util.eventListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class MyMouseListener_study implements MouseListener {
	// pdf 19쪽의 클래스는 내부이지만 이거 같은 경우에는 독립된 클래스
	// 따라서 jlabel 인스턴스 멤버설정 및, 생성자 초기화 후 작업진행
	public JLabel jLabel;
	
	public MyMouseListener_study (JLabel jLabel) {
		this.jLabel = jLabel;
	}
	
	public void mousePressed(MouseEvent event) {
		int x = event.getX(); // 마우스의 클릭 좌표 x
		int y = event.getY(); // 마우스의 클릭 좌표 y
		jLabel .setLocation(x, y); // (x,y) 위치로 레이블 이동
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

}
