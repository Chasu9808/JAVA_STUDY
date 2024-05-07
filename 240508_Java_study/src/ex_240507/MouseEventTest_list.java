package ex_240507;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import util.RandomSelectNumber;

public class MouseEventTest_list extends JFrame {
    
   
    public static void setLocationArrayList(List<JLabel> labelList, Container c) {
        for (JLabel jLabel : labelList) {
            jLabel.setSize(50, 20);
            int randomNumber = RandomSelectNumber.selectInt(100);
            jLabel.setLocation(30 + randomNumber , 30 + randomNumber );
            c.add(jLabel);
        }
    }
    
    public static void setLocationClickedArrayList(List<JLabel> labelList, int x, int y) {
        int randomNumber = RandomSelectNumber.selectInt(5);
        for (JLabel jLabel : labelList) {
            jLabel.setLocation(x * randomNumber , y * randomNumber );
        }
    }

    public MouseEventTest_list(List<JLabel> labelList) {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        
        c.addMouseListener(
            new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent event) {
                    int x = event.getX();
                    int y = event.getY();
                    setLocationClickedArrayList(labelList, x, y);
                }

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
            }
        );
        
        c.setLayout(null);
        
        setLocationArrayList(labelList, c);
        
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        JLabel la = new JLabel("Hello");
        JLabel la2 = new JLabel("오늘 뭐 먹지?");
        JLabel la3 = new JLabel("찜닭");
        JLabel la4 = new JLabel("설렁탕");
        JLabel la5 = new JLabel("미역국");

        List<JLabel> labelList = new ArrayList<>();
        labelList.add(la);
        labelList.add(la2);
        labelList.add(la3);
        labelList.add(la4);
        labelList.add(la5);
        
        MouseEventTest_list mouseEventTest = new MouseEventTest_list(labelList);
    }
}
