package util.eventListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class MyMouseListener implements MouseListener {
	// pdf 19 의 클래스는 내부 클래스 같은 위치에 있어서 라벨을 바로 이용가능. 
	// 하지만, 독립된 클래스, 
	// jLabel , 인스턴스 멤버를 설정도하고, 생성자 이용해서 초기화도 하고, 
	// 그리고 나서, 작업을 했음. 
	private JLabel jLabel;
	
	public  MyMouseListener(JLabel jLabel) {
		this.jLabel = jLabel;
		
	}
	// la -> jLabel 변경해서 사용함. 
	// 
	public void mousePressed(MouseEvent event) {
		int x = event.getX(); // 마우스의 클릭 좌표 x
		int y = event.getY(); // 마우스의 클릭 좌표 y
		jLabel.setLocation(x, y); // (x,y) 위치로 레이블 이동
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
