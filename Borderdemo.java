import javax.swing.*;
import javax.swing.border.*;
public class Borderdemo {
    Borderdemo(){
        JFrame f = new JFrame("Borderdemo");
        JButton b = new JButton("Click me");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Border b1 = BorderFactory.createLineBorder(java.awt.Color.PINK);

        b.setBorder(b1);
        f.add(b);
        f.setSize(200, 200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Borderdemo();
    }
}
