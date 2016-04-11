package cinemy.GUI.components;

import cinemy.GUI.StaticValues;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;

/**
 *
 * @author Patryk
 */
public class HintPasswordField extends JPasswordField implements FocusListener {

    private final String hint;
    private boolean showingHint;

    public HintPasswordField(final String hint, int x, int y, int width, int height) {
        super(hint);
        this.hint = hint;
        this.showingHint = true;
        super.addFocusListener(this);
        super.setForeground(new Color(170, 170, 170));
        initUI(x, y, width, height);
    }

    private void initUI(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setBackground(StaticValues.TEXT_FIELD_COLOR);
        this.setBorder(BorderFactory.createLineBorder(StaticValues.TEXT_FIELD_BORDER_COLOR, 1));
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (this.getText().isEmpty()) {
            super.setText("");
            super.setForeground(new Color(0, 0, 0));
            showingHint = false;
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (this.getText().isEmpty()) {
            super.setText(hint);
            super.setForeground(new Color(170, 170, 170));
            showingHint = true;
        }
    }

    @Override
    public String getText() {
        return showingHint ? "" : super.getText();
    }
}
