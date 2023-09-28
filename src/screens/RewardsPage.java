package screens;

import Utils.Utils;

import javax.swing.*;
import java.awt.*;

public class RewardsPage extends JPanel {
    public RewardsPage() {
        setLayout(new BorderLayout());
        setBackground(Utils.kBackgroundColor);

        JLabel label = new JLabel("Birju ❤ _____");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font(null, Font.BOLD, 18));

        add(label, BorderLayout.CENTER);
    }
}