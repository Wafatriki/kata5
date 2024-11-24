package es.ulpgc.dis.view;

import javax.swing.*;
import java.awt.*;

public class UserPanel extends JPanel {
    private JLabel photoLabel;

    public UserPanel() {
        setLayout(new BorderLayout());
        photoLabel = new JLabel();
        add(photoLabel, BorderLayout.CENTER);
    }

    public void setPhoto(byte[] photo) {
        ImageIcon icon = new ImageIcon(photo);
        photoLabel.setIcon(icon);
    }
}
