package cinemy.GUI.login;

import cinemy.GUI.Window;
import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Patryk
 */
public class LogInPanel extends JPanel {

    private JLabel bgImage;
    private final Window window;

    /**
     * Log In Panel Constructor
     *
     * @param window Reference to the main window object
     */
    public LogInPanel(Window window) {
        this.window = window;
        initUI(window.getWidth(), window.getHeight());
    }

    /**
     * Initialize User Interface
     *
     * @param width Width of the panel (Prefered to be width of the window)
     * @param height Height of the panel (Prefered to be height of the window)
     */
    private void initUI(int width, int height) {
        this.setSize(width, height);
        this.setVisible(true);
        this.setLayout(null);

        // Add Background Image
        this.bgImage = new JLabel(pickRandomBackgroundPhoto());
        this.bgImage.setBounds(0, 0, width, height);
        this.bgImage.setLayout(null);
        this.add(bgImage);

        // Add Main Authentication Panel
        int authWidth = 300;
        int authHeight = 400;
        this.bgImage.add(new AuthPanel(this,
                width / 2 - authWidth / 2,
                90,
                authWidth,
                authHeight));   // Add to bgImage to display on top
    }

    /** Pick And Return Random Background Picture
     * 
     * @return random background picture
     */
    private ImageIcon pickRandomBackgroundPhoto() {
        File folder = new File("res/sign_in/bg/");
        File[] listOfFiles = folder.listFiles();        
        return new ImageIcon(listOfFiles[(int) (Math.random() * listOfFiles.length)].getPath());
    }
}
