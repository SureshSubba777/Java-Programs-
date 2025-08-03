import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HandlingWindowEvent extends JFrame implements WindowListener {
    JLabel l;
    HandlingWindowEvent(){
        l = new JLabel("Windows");
        setTitle("Window Event");
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(l);
        addWindowListener(this);
        setVisible(true);
    }
    public void windowOpened(WindowEvent e){
        l.setText("Opened");
    }
    public void windowClosing(WindowEvent e){
        l.setText("Closing");
    }
    public void windowClosed(WindowEvent e){
        l.setText("Closed");
    }
    public void windowIconified(WindowEvent e){
        setTitle("Minimized Window");
    }
    public void windowDeiconified(WindowEvent e){
        setTitle("Restored Window");
    }
    public void windowActivated(WindowEvent e){
        setTitle("Activated Window");
    }
    public void windowDeactivated(WindowEvent e){
        setTitle("Deactivated window");
    }

    public static void main(String[] args) {
        new HandlingWindowEvent();
    }
}
