import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.GridLayout;

public class HandlingFocusEvent extends JFrame implements FocusListener {
    private JTextField tf1,tf2;
    public HandlingFocusEvent(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf1 = new JTextField();
        tf1.setBounds(50,50,50,50);
        tf2 = new JTextField();
        tf2.setBounds(50,50,50,50);
        add(tf1);
        add(tf2);
        tf1.addFocusListener(this);
        tf2.addFocusListener(this);
        setVisible(true);
        setLayout(new GridLayout(1,2));
    }
    public void focusGained(FocusEvent e){
        if (e.getSource().equals(tf1)){
            tf1.setBackground(Color.YELLOW);
        }
        else{
            tf2.setBackground(Color.RED);
        }
    }
    public void focusLost(FocusEvent e){
        if (e.getSource().equals(tf1)){
            tf1.setBackground(Color.WHITE);
        }
        else{
            tf2.setBackground(Color.WHITE);
        }
    }
    public static void main(String[] args) {
        new HandlingFocusEvent();
    }

}

