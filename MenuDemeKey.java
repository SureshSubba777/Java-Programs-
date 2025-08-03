import javax.swing.*;
public class MenuDemeKey {
    JMenuBar mb;
    JMenu fm, em, vm;
    JMenuItem open, save;
    JCheckBoxMenuItem misb;
    MenuDemeKey(){
        JFrame f = new JFrame("Menu");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Menu");
        mb = new JMenuBar();
        fm = new JMenu("File");
        em = new JMenu("Edit");
        vm = new JMenu("View");
        fm.setMnemonic('F');


        mb.add(fm);
        mb.add(em);
        mb.add(vm);
        open = new JMenuItem("Open", 'o');
        save = new JMenuItem("Save", 's');
        misb = new JCheckBoxMenuItem("Status", false);
        fm.add(open);
        fm.add(save);
        vm.add(misb);

        f.add(mb);
       f.setVisible(true);

    }
    public static void main(String[] args) {
        new MenuDemeKey();
    }
}
