import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HandlingItemEvent extends JFrame implements ItemListener {
    JLabel l = new JLabel("");
    HandlingItemEvent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        JCheckBox check = new JCheckBox("Click Me");
        setLayout(new FlowLayout());
        add(check);
        add(l);
        check.addItemListener(this);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED){
            l.setText("You have Clicked");
        }
        else if (e.getStateChange() == ItemEvent.DESELECTED){
            l.setText("You have not Clicked");
        }
    }
    public static void main(String[] args) {
        new HandlingItemEvent();
    }
}
