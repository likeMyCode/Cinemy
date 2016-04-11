package cinemy.GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Patryk
 */
public class Window extends JFrame {

    private JPanel currentPanel = new JPanel();

    /**
     * Main Window Constructor
     *
     * @param title Window title
     * @param width Width of the window
     * @param height Height of the window
     */
    public Window(String title, int width, int height) {
        initUI(title, width, height);
    }

    /**
     * Initialize User Interface
     *
     * @param title Window title
     * @param width Width of the window
     * @param height Height of the window
     */
    private void initUI(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(new Dimension(width, height));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);   // Center a window
        this.setVisible(true);
    }

    /**
     * Show Panel Method - used in case we want to display new panel. It removes
     * old panel which was displayed, and add new one.
     *
     * @param newPanel New panel we want to display
     */
    public void showPanel(JPanel newPanel) {
        this.remove(currentPanel);
        this.add(newPanel);
        currentPanel = newPanel;
        this.repaint();
        this.revalidate();
    }
}
