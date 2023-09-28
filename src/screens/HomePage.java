package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HomePage extends JFrame implements ActionListener{

    public HomePage() {
        JLabel label1=new JLabel("TurFit - Turf Management System");
        label1.setFont(new Font(null,Font.BOLD,15));

        JLabel label2=new JLabel("Come on and Unveil the Player Inside You");
        label2.setFont(new Font(null,Font.BOLD,12));

        JLabel label3=new JLabel();
        label3.setText("                        Membership                         ");
        label3.setFont(new Font(null,Font.BOLD,18));
        label3.setLocation(0,0);


        JLabel label4=new JLabel();
        label4.setText("Gold            Silver            Bronze");
        label4.setFont(new Font(null,Font.BOLD,13));
        label4.setLocation(10,30);



        JPanel panel1=new JPanel();
        panel1.setBounds(10,50,420,50);
        panel1.setBackground(Color.white);
        panel1.add(label1).setLocation(10,0);
        panel1.add(label2).setLocation(10,30);

        JPanel panel2=new JPanel();
        panel2.setBackground(Color.gray);
        panel2.setBounds(10,100,420,60);
        panel2.add(label3).setLocation(0,0);
        panel2.add(label4);

        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();

        JButton button1= new JButton("HOMEPAGE");
        button1.setBounds(10,10,100,30);
        button1.setBackground(Color.blue);
        button1.setFocusable(false);

        JButton button2= new JButton("PROFILE");
        button2.setBounds(115,10,100,30);
        button2.setFocusable(false);

        JButton button3= new JButton("TURF LIST");
        button3.setBounds(220,10,100,30);
        button3.setFocusable(false);

        JButton button4= new JButton("REWARDS");
        button4.setBounds(325,10,100,30);
        button4.setFocusable(false);



        JButton btn1=new JButton("Organise Tournaments");
        btn1.setFocusable(false);
        btn1.setBounds(10,200,420,30);

        JButton btn2=new JButton("Check Tournaments");
        btn2.setFocusable(false);
        btn2.setBounds(10,240,420,30);

        JButton btn3=new JButton("Apply for Membership");
        btn3.setFocusable(false);
        btn3.setBounds(10,160,420,30);

        JButton btn4=new JButton("Browse Turfs");
        btn4.setFocusable(false);
        btn4.setBounds(10,280,420,30);

        this.add(btn1);
        this.add(btn4);
        this.add(btn2);
        this.add(btn3);
        this.setTitle("Homepage");
        this.add(panel1);
        this.add(panel2);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450,400);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
