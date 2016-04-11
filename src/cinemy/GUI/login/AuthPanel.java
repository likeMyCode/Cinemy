package cinemy.GUI.login;

import cinemy.GUI.StaticValues;
import cinemy.GUI.components.HintTextField;
import cinemy.GUI.components.HintPasswordField;
import cinemy.GUI.components.LinkLabel;
import cinemy.GUI.components.SubmitButton;
import cinemy.GUI.mainpanel.MainPanel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Patryk
 */
public class AuthPanel extends JPanel {

    // ----- DYNAMIC OBJECTS ----- //
    private final LogInPanel logInPanel;
    private JLabel logoImage, registerLink;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton submitButton;

    /**
     * Authentication Panel Constructor
     *
     * @param logInPanel Reference to the log in panel
     * @param x X position coordinate
     * @param y Y position coordinate
     * @param width Panel width
     * @param height Panel Height
     */
    public AuthPanel(LogInPanel logInPanel, int x, int y, int width, int height) {
        this.logInPanel = logInPanel;
        initUI(x, y, width, height);
    }

    /**
     * Initialize User Interface
     *
     * @param x X position coordinate
     * @param y Y position coordinate
     * @param width Panel width
     * @param height Panel Height
     */
    private void initUI(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setOpaque(true);
        this.setBackground(StaticValues.PANE_COLOR);
        this.setBorder(BorderFactory.createLineBorder(StaticValues.PANE_BORDER_COLOR, 1));
        this.setLayout(null);

        // Add Logo Image
        this.logoImage = new JLabel(new ImageIcon("res/sign_in/logo.png"));
        this.logoImage.setBounds(width / 2 - 125 / 2, 30, 125, 125);
        this.add(logoImage);

        // Add Email Edit
        this.emailField = new HintTextField("Email", (width / 2) - (180 / 2), 195, 180, 30);
        this.add(emailField);

        // Add Password Edit
        this.passwordField = new HintPasswordField("Password", (width / 2) - (180 / 2), 240, 180, 30);
        this.add(passwordField);

        // Add Submit Button
        this.submitButton = new SubmitButton("Log In", () -> {
            throw new UnsupportedOperationException("Create method to check user data for logging process");
        }, width / 2 - 100 / 2, 300, 100, 30);
        this.add(submitButton);

        // Add Registration Link
        this.registerLink = new LinkLabel("Join to our community", () -> {
            throw new UnsupportedOperationException("Create link to registration panel here");
        }, 0, 345, width, 30);
        this.add(registerLink);
    }
}
