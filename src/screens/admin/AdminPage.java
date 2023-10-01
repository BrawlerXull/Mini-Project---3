package screens.admin;

import javax.swing.*;
import java.awt.*;

public class AdminPage extends JFrame {
    AdminPage() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("./assets/profile.png"));
        Image i2= i1.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0,180,180);
        this.add(label);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(24, 170, 170));
        panel2.setBounds(0,0,220,600);
        panel2.add(label);

        JButton turflist = new JButton("Turf List");
        turflist.setBounds(10,200,200,30);
        turflist.setFocusable(false);
        turflist.setForeground(Color.BLACK);
        turflist.setBackground(Color.LIGHT_GRAY);

        JButton check = new JButton("Check Tournaments");
        check.setBounds(10,250,200,30);
        check.setFocusable(false);
        check.setForeground(Color.BLACK);
        check.setBackground(Color.LIGHT_GRAY);

        JButton earning = new JButton("Earnings");
        earning.setBounds(10,300,200,30);
        earning.setFocusable(false);
        earning.setForeground(Color.BLACK);
        earning.setBackground(Color.LIGHT_GRAY);

        JButton userlist = new JButton("User List");
        userlist.setBounds(10,350,200,30);
        userlist.setFocusable(false);
        userlist.setForeground(Color.BLACK);
        userlist.setBackground(Color.LIGHT_GRAY);

        JButton addList = new JButton("Maintainance");
        addList.setBounds(10,400,200,30);
        addList.setFocusable(false);
        addList.setForeground(Color.BLACK);
        addList.setBackground(Color.LIGHT_GRAY);

        JButton backl = new JButton("Back to Login");
        backl.setBounds(10,500,200,30);
        backl.setFocusable(false);
        backl.setForeground(Color.BLACK);
        backl.setBackground(Color.LIGHT_GRAY);

        this.add(turflist);
        this.add(check);
        this.add(userlist);
        this.add(earning);
        this.add(addList);
        this.add(backl);

        this.setBackground(Color.WHITE);
        this.add(panel2);
        this.setLayout(null);
        this.setResizable(true);
        this.setTitle("Organise Tournaments");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPage();
    }
}