package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class View extends JFrame implements ActionListener {
    static class LogIn extends View {
        JButton b1;
        JPanel newPanel;
        JLabel userLabel;
        JTextField textField1;
        JLabel errorMessage;

        LogIn() {
            userLabel = new JLabel();
            userLabel.setText("Username");
            textField1 = new JTextField(15);
            b1 = new JButton("Log in");
            errorMessage = new JLabel("Please enter valid email.");

            newPanel = new JPanel();
            newPanel.add(userLabel);
            newPanel.add(textField1);
            newPanel.add(b1);
            add(newPanel, BorderLayout.CENTER);

            b1.addActionListener(this);
            setTitle("Log in");

        }

        public void actionPerformed(ActionEvent ae) {
            String userValue = textField1.getText();
            if (userValue.equals("helmiina.toivonen@gmail.com"))
            {
                JFrame HomePage = new JFrame();
                HomePage.setVisible(true);
            } else
                newPanel.add(errorMessage);
        }


        static class HomePage extends View implements ActionListener {

            // Homepage
            JPanel homepageP;
            JLabel user1;
            JLabel schedulesTitle;
            JButton mainScheduleButton;
            JButton personalSchedule;
            JTable mainSchedule;
            JLabel wel_label;

            HomePage()
            {
                user1 = new JLabel();
                user1.setBounds(50, 10, 30, 25);
                schedulesTitle = new JLabel();
                mainScheduleButton = new JButton();
                personalSchedule = new JButton();
                mainSchedule = new JTable();
                wel_label = new JLabel();

                homepageP = new JPanel();
                homepageP.setSize(1000, 700);
                homepageP.add(user1);
                homepageP.add(schedulesTitle);
                homepageP.add(personalSchedule);
                homepageP.add(mainSchedule);
                homepageP.add(mainScheduleButton);
                homepageP.add(wel_label);

            }

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
    }
}



