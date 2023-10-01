package screens.user;

import Utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import static Utils.Utils.bookingListModel;

public class ProfilePage extends JPanel {
    public ProfilePage() {
        setBackground(Utils.kBackgroundColor);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.white);
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("TurFit - Turf Management System");
        titleLabel.setFont(new Font(null, Font.BOLD, 15));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descriptionLabel = new JLabel("Come on and Unveil the Player Inside You");
        descriptionLabel.setFont(new Font(null, Font.BOLD, 12));
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        topPanel.add(titleLabel);
        topPanel.add(descriptionLabel);

        JPanel profileInfoPanel = new JPanel();
        profileInfoPanel.setBackground(Color.white);
        profileInfoPanel.setLayout(new BoxLayout(profileInfoPanel, BoxLayout.X_AXIS));

        ImageIcon originalProfileImage = new ImageIcon(Objects.requireNonNull(getClass().getResource("/assets/profile.png")));
        Image scaledProfileImage = originalProfileImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon profileImage = new ImageIcon(scaledProfileImage);

        JLabel profileImageLabel = new JLabel(profileImage);
        profileImageLabel.setAlignmentY(Component.TOP_ALIGNMENT);

        JPanel textInfoPanel = new JPanel();
        textInfoPanel.setLayout(new BoxLayout(textInfoPanel, BoxLayout.Y_AXIS));

        JLabel personNameLabel = new JLabel("____le K____");
        JLabel usernameLabel = new JLabel("@saimple");
        JLabel bioLabel = new JLabel("A passionate fax enthusiast.");

        personNameLabel.setFont(new Font(null, Font.BOLD, 18));
        usernameLabel.setFont(new Font(null, Font.PLAIN, 14));
        bioLabel.setFont(new Font(null, Font.PLAIN, 14));

        textInfoPanel.add(personNameLabel);
        textInfoPanel.add(usernameLabel);
        textInfoPanel.add(bioLabel);

        profileInfoPanel.add(profileImageLabel);
        profileInfoPanel.add(textInfoPanel);

        JPanel bookingHistoryPanel = new JPanel();
        bookingHistoryPanel.setBackground(Color.white);
        bookingHistoryPanel.setLayout(new BorderLayout());

        JLabel bookingHistoryLabel = new JLabel("Booking History");
        bookingHistoryLabel.setFont(new Font(null, Font.BOLD, 15));
        bookingHistoryLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JList<String> bookingList = new JList<>(bookingListModel);
        bookingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(bookingList);

        bookingHistoryPanel.add(bookingHistoryLabel, BorderLayout.NORTH);
        bookingHistoryPanel.add(scrollPane, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(profileInfoPanel, BorderLayout.WEST);
        add(bookingHistoryPanel, BorderLayout.CENTER);
    }
}
