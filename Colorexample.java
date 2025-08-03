import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;


public class Colorexample {
    Colorexample(){
        JFrame f = new JFrame("Parent Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
        JPanel jp = new JPanel();
        f.add(jp);
        Color c =  JColorChooser.showDialog(jp, "show color", Color.red );
        jp.setSize(300,300);
        jp.setLayout(new FlowLayout( FlowLayout.CENTER));
        jp.setBackground(c);
    }
    public static void main(String[] args) {
        new Colorexample();
    }
}
