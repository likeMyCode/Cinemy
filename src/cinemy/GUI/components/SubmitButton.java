package cinemy.GUI.components;

import cinemy.GUI.StaticValues;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author Patryk
 */
public class SubmitButton extends JButton {

    private final Runnable afterSubmit;

    public SubmitButton(String title, Runnable afterSubmit, int x, int y, int width, int height) {
        this.afterSubmit = afterSubmit;
        initUI(title, x, y, width, height);
    }

    private void initUI(String title, int x, int y, int width, int height) {
        this.setText(title);
        this.setBounds(x, y, width, height);
        this.setBackground(StaticValues.BUTTON_COLOR);
        this.setBorder(BorderFactory.createLineBorder(StaticValues.BUTTON_BORDER_COLOR));
        this.setFont(StaticValues.SUBMIT_BUTTON_FONT);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                afterSubmit.run();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(StaticValues.BUTTON_ENTERED_COLOR);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(StaticValues.BUTTON_COLOR);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }
}
