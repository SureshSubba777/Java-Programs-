import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;



public class HandlingKeyEvents extends JFrame  {
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    HandlingKeyEvents(){
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t1);
        add(t2);
        t2.setEditable(false);
        t1.addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyTyped(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){
                String s = t1.getText();
                t2.setText(s);
            }
        });
          setVisible(true);

    }
    public static void main(String[] args) {
        new HandlingKeyEvents();
    }
}
