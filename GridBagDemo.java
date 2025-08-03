import java.awt.*;
import javax.swing.*;

public class GridBagDemo {
    JButton b1,b2,b3;
    GridBagDemo(){
        JFrame f = new JFrame();
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");

        JPanel jp = new JPanel( new GridBagLayout());
        GridBagConstraints crs = new GridBagConstraints();
        crs.fill = GridBagConstraints.HORIZONTAL;
        crs.gridx = 0;
        crs.gridy = 0;
        jp.add(b1,crs);
        crs.fill = GridBagConstraints.HORIZONTAL;
        crs.gridx = 3;
        crs.gridy = 0;
        jp.add(b2,crs);
        crs.fill = GridBagConstraints.HORIZONTAL;
        crs.gridx = 6;
        crs.gridy = 0;
        jp.add(b3,crs);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.getContentPane().add(jp);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagDemo();
    }
}
