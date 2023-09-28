package screens;

import javax.swing.*;
import java.awt.*;

public class TurfListPage extends JPanel {
    public TurfListPage() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        JLabel label = new JLabel("10 rs ki pepsi ______ and ______ ki jodi sexy");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font(null, Font.BOLD, 18));

        add(label, BorderLayout.CENTER);
    }
}