import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdapterClass extends JFrame {
    JLabel l ;
    AdapterClass(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,400);
    setLayout(new FlowLayout());
    l = new JLabel("Key is not pressed");
    add(l);
    addKeyListener(new CustomKeyAdapter());
    setVisible(true);
    }
    class  CustomKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e ){
            l.setText("Key Pressed "+e.getKeyChar());
        }
        @Override
        public void keyReleased(KeyEvent e ){
            l.setText("Key Released "+e.getKeyChar());
        }
    }
    public static void main(String[] args) {
        new AdapterClass();
    }
}
