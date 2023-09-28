package screens;

import javax.swing.*;
import java.awt.*;

public class RewardsPage extends JPanel {
    public RewardsPage() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        JLabel label = new JLabel("Birju ❤ _____");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font(null, Font.BOLD, 18));

        add(label, BorderLayout.CENTER);
    }
}