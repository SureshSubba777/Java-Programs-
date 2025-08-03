import java.awt. Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GroupLayoutDemo {
    public static void main (String[] args) {
     JFrame f = new JFrame("GroupLayoutExample");
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container contentPanel = f.getContentPane();
     GroupLayout gl = new GroupLayout(contentPanel);
     contentPanel.setLayout(gl);

     JLabel jl = new JLabel("Click Here");
     JButton b = new JButton("This Button");

     gl.setHorizontalGroup(
        gl.createSequentialGroup().addComponent(jl)
        .addGap(10,20,100)
        .addComponent(b)
     );

     gl.setVerticalGroup(
        gl.createParallelGroup().addComponent(jl)
        .addComponent(b)
     );
     f.pack();
     f.setVisible(true);
    }

}
