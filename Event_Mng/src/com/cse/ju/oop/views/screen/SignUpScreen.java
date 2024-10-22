package com.cse.ju.oop.views.screen;

import javax.swing.*;

public class SignUpScreen {

    public void showSignUpScreen() {
        JFrame frame = new JFrame("Sign Up");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField nameField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JTextField phoneField = new JTextField(15);
        JTextField batchField = new JTextField(15);
        JTextField rollField = new JTextField(15);
        JTextField sessionField = new JTextField(15);

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Phone Number:"));
        panel.add(phoneField);
        panel.add(new JLabel("Batch:"));
        panel.add(batchField);
        panel.add(new JLabel("Roll:"));
        panel.add(rollField);
        panel.add(new JLabel("Session:"));
        panel.add(sessionField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Call controller to handle registration
            JOptionPane.showMessageDialog(frame, "Registered successfully!");
            new DashboardScreen().showDashboard();
            frame.dispose();
        });

        panel.add(submitButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
