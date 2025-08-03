import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
    JButton b1,b2,b3;
    
    GridLayoutDemo(){
     JFrame f = new JFrame();
     b1 = new JButton("A");
     b2 = new JButton("B");
    b3 = new JButton("C");
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.setLayout(new GridLayout(2,2));
    f.setSize(300,300);
    f.setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
