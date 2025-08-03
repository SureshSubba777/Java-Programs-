import javax.swing.*;
import java.awt.event.*;


public class HandlingActionEvent extends JFrame implements ActionListener {
    JTextField jt;
    HandlingActionEvent(){
        jt = new JTextField();
        jt.setBounds(100,40,100,40);
        add(jt);
        JButton jb = new JButton("click me");
        jb.setBounds(40,40,40,40);
        
        jb.addActionListener(this);
        jb.setActionCommand("proceed");
        add(jb);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("proceed"))
            jt.setText("You are here");
        }
          public static void main(String[] args) {
        new HandlingActionEvent();
    }
    }

  
