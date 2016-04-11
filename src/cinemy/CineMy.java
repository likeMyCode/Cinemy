package cinemy;

import cinemy.GUI.login.LogInPanel;
import cinemy.GUI.Window;

/**
 *
 * @author Patryk
 */
public class CineMy {

    public static void main(String[] args) {
        Window window = new Window("Cinemy", 1000, 600);
        window.showPanel(new LogInPanel(window));
        //window.showPanel(new RegisterCinemyPanel());
    }

}
