package cinemy.GUI.components;

import cinemy.GUI.StaticValues;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Patryk
 */
public class LinkLabel extends JLabel {

    private final Runnable afterClick;

    public LinkLabel(String title, Runnable afterClick, int x, int y, int width, int height) {
        this.afterClick = afterClick;
        initUI(title, x, y, width, height);
    }

    private void initUI(String title, int x, int y, int width, int height) {
        this.setText(title);
        this.setHorizontalAlignment(SwingUtilities.CENTER);
        this.setBounds(x, y, width, height);
        this.setForeground(StaticValues.LINK_LABEL_COLOR);
        this.setFont(StaticValues.LINK_LABEL_FONT);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                afterClick.run();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setForeground(StaticValues.LINK_LABEL_ENTERED_COLOR);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setForeground(StaticValues.LINK_LABEL_COLOR);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }
}
