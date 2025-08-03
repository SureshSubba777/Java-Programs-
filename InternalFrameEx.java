import javax.swing.*;
import java.awt.*;

public class InternalFrameEx {
    InternalFrameEx() {
        // Create main frame
        JFrame frame = new JFrame("Internal Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create desktop pane
        JDesktopPane desktopPane = new JDesktopPane();

        // Create internal frame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(250, 150);
        internalFrame.setLocation(50, 50);
        internalFrame.setLayout(new FlowLayout());

        // Add components to internal frame
        JLabel name = new JLabel("Name:");
        JTextField jt = new JTextField(10);
        internalFrame.add(name);
        internalFrame.add(jt);

        // Make internal frame visible
        internalFrame.setVisible(true);

        // Add internal frame to desktop pane
        desktopPane.add(internalFrame);

        // Add desktop pane to main frame
        frame.add(desktopPane);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        new InternalFrameEx();
    }
}
