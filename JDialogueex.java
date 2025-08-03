import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing. JLabel;
import javax.swing.JTextField;

public class JDialogueex {
    JDialogueex(){
        JLabel jl = new JLabel("Name");
        JTextField jt = new JTextField(10);
        JFrame jf = new JFrame();
        JDialog jd = new JDialog( jf, "Dialogbox", true);
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setTitle("Parent Frame");
        jd.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        jd.setSize(300,200);
        jd.setLocation(50,59);
        jd.add(jl);
        jd.add(jt);
        jd.setVisible(true);
    }
    public static void main(String[] args) {
        new JDialogueex();
    }
}
