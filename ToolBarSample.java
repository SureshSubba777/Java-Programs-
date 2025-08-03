import java.awt. BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
public class ToolBarSample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);

        JButton b = new JButton("Button1");
        toolbar.add(b);
        toolbar.addSeparator();

        toolbar.add(new JButton("Button2"));

        toolbar.add(new JComboBox<>(new String[]{"A","B"}));

        Container c = f.getContentPane();
        c.add(toolbar,BorderLayout.NORTH);
        JTextArea textArea = new JTextArea();
        JScrollPane pane = new JScrollPane(textArea);
        c.add(pane,BorderLayout.CENTER);
        f.setSize(350,150);
        f.setVisible(true);
    }
}
