package screens;

import Utils.Utils;
import jdk.jshell.execution.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JPanel {
    public HomePage() {
        setLayout(null);
        setBackground(Utils.kBackgroundColor);

        JLabel label1 = new JLabel("TurFit - Turf Management System");
        label1.setFont(new Font(null, Font.BOLD, 15));
        label1.setBounds(10, 10, 400, 20);
        JLabel label2 = new JLabel("Come on and Unveil the Player Inside You");
        label2.setFont(new Font(null, Font.BOLD, 12));
        label2.setBounds(10, 40, 400, 20);

        JLabel label3 = new JLabel("Membership");
        label3.setFont(new Font(null, Font.BOLD, 18));
        label3.setBounds(10, 100, 400, 20);

        JLabel label4 = new JLabel("Gold            Silver            Bronze");
        label4.setFont(new Font(null, Font.BOLD, 13));
        label4.setBounds(10, 130, 400, 20);

        JPanel panel1 = new JPanel();
        panel1.setBounds(10, 50, 420, 50);
        panel1.setBackground(Color.white);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.gray);
        panel2.setBounds(10, 170, 420, 60);

        JButton btn1 = new JButton("Organise Tournaments");
        btn1.setFocusable(false);
        btn1.setBounds(10, 240, 420, 30);

        JButton btn2 = new JButton("Check Tournaments");
        btn2.setFocusable(false);
        btn2.setBounds(10, 280, 420, 30);

        JButton btn3 = new JButton("Apply for Membership");
        btn3.setFocusable(false);
        btn3.setBounds(10, 320, 420, 30);

        JButton btn4 = new JButton("Browse Turfs");
        btn4.setFocusable(false);
        btn4.setBounds(10, 360, 420, 30);

        panel1.add(label1);
        panel1.add(label2);

        panel2.add(label3);
        panel2.add(label4);

        add(panel1);
        add(panel2);
        add(btn1);
        add(btn4);
        add(btn2);
        add(btn3);

        this.setSize(450, 400);
        this.setVisible(true);
    }
}
