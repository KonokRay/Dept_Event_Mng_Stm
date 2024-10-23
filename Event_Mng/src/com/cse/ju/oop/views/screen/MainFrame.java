package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        frame = new JFrame("Main Menu");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setLayout(null);

        JButton loginButton = new JButton("Login");
        JButton signupButton = new JButton("Sign Up");

        loginButton.setBounds(50, 50, 200, 30);
        signupButton.setBounds(50, 100, 200, 30);

        frame.add(loginButton);
        frame.add(signupButton);

        // Action Listener for Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginFrame(); // Open LoginFrame
                frame.dispose(); // Close MainFrame
            }
        });

        // Action Listener for Sign Up Button
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignupFrame(); // Open SignupFrame
                frame.dispose(); // Close MainFrame
            }
        });

        frame.setVisible(true);
    }
}
