import javax.swing.*;
import java.awt.*;

public class SimpleCursor extends JFrame {
    static int width = 800;
    static int height = 600;
    public SimpleCursor() {
        super("simple cursor");
        initGui();
    }
    private void initGui() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(SimpleCursor.width, SimpleCursor.height));
        this.setLocation(d.width / 2 - SimpleCursor.width / 2, d.height / 2 - SimpleCursor.height / 2);
        this.getContentPane().setBackground(Color.lightGray);
        this.setResizable(false);

        this.getContentPane().setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleCursor frame = new SimpleCursor();
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
