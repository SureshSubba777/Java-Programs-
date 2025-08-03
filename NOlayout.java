import javax.swing.*;

public class NOlayout {
    NOlayout(){
        JFrame f = new JFrame();
        JButton b = new JButton("Click Here");
        b.setBounds(50,100,100,100);
        f.add(b);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new NOlayout();
    }
}
