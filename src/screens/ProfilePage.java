package screens;

import Utils.Utils;

import javax.swing.*;
import java.awt.*;

public class ProfilePage extends JPanel {
    public ProfilePage() {
        setLayout(new BorderLayout());
        setBackground(Utils.kBackgroundColor);

        JLabel label = new JLabel("311 m hui _______ ki 14yi");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font(null, Font.BOLD, 18));

        add(label, BorderLayout.CENTER);
    }
}