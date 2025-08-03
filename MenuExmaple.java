import javax.swing.*;

public class MenuExmaple {
    JMenu menu, submenu;
    JMenuItem i1,i2,i3,i4,i5;

        
    MenuExmaple(){
        JFrame f = new JFrame("Menu Item");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        i1 = new JMenuItem("I1");
        i2 = new JMenuItem("I2");
        i3 = new JMenuItem("I3");
        i4 = new JMenuItem("I4");
        i5 = new JMenuItem("I5");

        submenu = new JMenu("Submenu");
        menu = new JMenu("Menu");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(200, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExmaple();
    }
}
