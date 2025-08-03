
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Filechooser {
    Filechooser(){
        JFileChooser jf = new JFileChooser();
        JFrame f =new JFrame("File chosser");
        // f.setSize(400,400);
        // f.setVisible(true);
        jf.showOpenDialog(f);

    }
    public static void main(String[] args) {
        new Filechooser();
    }
}
