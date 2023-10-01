package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckTournaments extends JFrame implements ActionListener {
    JButton bookbutton;
    JButton back;
    CheckTournaments() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.png"));
        Image i2= i1.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setSize(75,75);
        icon.setLocation(80,10);
        icon.setHorizontalAlignment(JLabel.LEFT);
        this.add(icon);

        bookbutton = new JButton("Book Tournament");
        bookbutton.setBounds(50,400,150,30);
        bookbutton.setFocusable(false);

        back = new JButton("Back");
        back.setBounds(250,400,150,30);
        back.setFocusable(false);

        JLabel toplabel = new JLabel("Tournament List");
        toplabel.setBounds(170,0,440,100);
        toplabel.setFont(new Font(null,Font.BOLD,20));

        bookbutton.addActionListener(this);
        back.addActionListener(this);

        this.add(bookbutton);
        this.add(back);
        this.add(toplabel);

        this.setResizable(false);
        this.setTitle("Check Tournaments");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            homepage homepage= new homepage();
            setVisible(false);
        }
        if(e.getSource()==bookbutton){
            JOptionPane.showMessageDialog(null, "Booked Successfully", "Form Submission", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }
    public static void main(String[] args) {
        new CheckTournaments();
    }
}
