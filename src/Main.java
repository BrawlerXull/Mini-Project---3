// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import screens.HomePage;

public class Main {
    public static void main(String[] args) {
            HomePage home=new HomePage();
    }
}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

























//class TurfManagementSystemHomepage {
//    public static void main(String[] args) {
//        // Create the main frame
//        JFrame frame = new JFrame("Turf Management System");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//
//        // Create a panel to hold components
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//
//        // Create a button to book a turf
//        JButton bookButton = new JButton("Book a Turf");
//        bookButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Add code to handle booking here
//                JOptionPane.showMessageDialog(frame, "Booking feature coming soon!");
//            }
//        });
//
//        // Create a list of tournaments
//        DefaultListModel<String> tournamentListModel = new DefaultListModel<>();
//        JList<String> tournamentList = new JList<>(tournamentListModel);
//
//        // Add sample tournaments
//        tournamentListModel.addElement("Tournament 1");
//        tournamentListModel.addElement("Tournament 2");
//        tournamentListModel.addElement("Tournament 3");
//
//        // Add components to the panel
//        panel.add(bookButton);
//        panel.add(new JScrollPane(tournamentList));
//
//        // Add the panel to the frame
//        frame.add(panel);
//
//        // Make the frame visible
//        frame.setVisible(true);
//    }
//}