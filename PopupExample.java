import javax.swing.*;
import java.awt.event.*;

public class PopupExample {
    JMenuItem cut, copy, paste;

    PopupExample() {
        final JFrame f = new JFrame("PopupMenu");
        final JPopupMenu pm = new JPopupMenu("Edit");

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        f.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    pm.show(f, e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    pm.show(f, e.getX(), e.getY());
                }
            }
        });
        f.add(pm);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PopupExample();
    }
}
