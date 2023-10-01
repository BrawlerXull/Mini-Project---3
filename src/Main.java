import screens.user.HomePage;
import screens.user.ProfilePage;
import screens.user.RewardsPage;
import screens.user.TurfListPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Turf Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450, 400);
            frame.setLayout(new BorderLayout());

            JPanel navigationPanel = new JPanel();
            navigationPanel.setLayout(new FlowLayout());

            JButton homeButton = createNavigationButton("Homepage", frame);
            JButton profileButton = createNavigationButton("Profile", frame);
            JButton turfListButton = createNavigationButton("Turf List", frame);
            JButton rewardsButton = createNavigationButton("Rewards", frame);

            navigationPanel.add(homeButton);
            navigationPanel.add(profileButton);
            navigationPanel.add(turfListButton);
            navigationPanel.add(rewardsButton);

            frame.add(navigationPanel, BorderLayout.NORTH);

            HomePage homePage = new HomePage();
            frame.add(homePage, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }

    private static JButton createNavigationButton(String text, JFrame frame) {
        JButton button = new JButton(text);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel contentPanel = (JPanel) frame.getContentPane().getComponent(1);
                frame.remove(contentPanel);

                if (text.equals("Homepage")) {
                    HomePage homePage = new HomePage();
                    frame.add(homePage, BorderLayout.CENTER);
                } else if (text.equals("Profile")) {
                    ProfilePage profilePage = new ProfilePage();
                    frame.add(profilePage, BorderLayout.CENTER);
                } else if (text.equals("Turf List")) {
                    TurfListPage turfListPage = new TurfListPage();
                    frame.add(turfListPage, BorderLayout.CENTER);
                } else if (text.equals("Rewards")) {
                    RewardsPage rewardsPage = new RewardsPage();
                    frame.add(rewardsPage, BorderLayout.CENTER);
                }

                frame.revalidate();
                frame.repaint();
            }
        });
        return button;
    }
}