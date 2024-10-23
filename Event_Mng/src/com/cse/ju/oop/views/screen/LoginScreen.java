package com.cse.ju.oop.views.screen;

import javax.swing.*;

public class LoginScreen {

    public void showLoginScreen(String userType) {
        JFrame frame = new JFrame(userType + " Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel userLabel = new JLabel("User Name:");
        JTextField userField = new JTextField(15);

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);

        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(e -> {
            if (userType.equals("Admin")) {
                new EventScreen().showAdminScreen();
            } else {
                new DashboardScreen().showDashboard();
            }
            frame.dispose();
        });

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(nextButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
