import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HandlingMouseEvent extends JFrame implements MouseListener {
    JButton b;
    HandlingMouseEvent(){
        b = new JButton("Click Me");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(b);
        b.addMouseListener(this);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        b.setText("Clicked");
    }
    public void mouseEntered(MouseEvent e){
        b.setBackground(Color.YELLOW);
    }
    public  void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e) {}
    public void mouseExited(MouseEvent e){
        b.setBackground(Color.WHITE);
    }
    public static void main(String[] args) {
        new HandlingMouseEvent();
    }
}
