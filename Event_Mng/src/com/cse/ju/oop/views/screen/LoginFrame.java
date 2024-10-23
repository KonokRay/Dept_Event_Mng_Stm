package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame {

    public LoginFrame() {
        // Create the main frame
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Use DISPOSE_ON_CLOSE to avoid closing the entire app
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Set frame to fullscreen
        frame.setUndecorated(true); // Remove window borders
        frame.setLayout(new GridBagLayout()); // Use GridBagLayout to center components

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding around components
        gbc.gridx = 0; // Center in column 0
        gbc.fill = GridBagConstraints.HORIZONTAL; // Stretch components horizontally
        gbc.anchor = GridBagConstraints.CENTER; // Center all components

        // Create labels for Username and Password
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        // Create input fields
        JTextField usernameField = new JTextField(20); // Set preferred size
        JPasswordField passwordField = new JPasswordField(20); // Set preferred size

        // Create Login button
        JButton loginButton = new JButton("Login");

        // Create a close button styled as a red cross
        JButton closeButton = new JButton("X");
        closeButton.setFont(new Font("Arial", Font.BOLD, 20));
        closeButton.setForeground(Color.RED);
        closeButton.setContentAreaFilled(false); // Make it transparent
        closeButton.setBorderPainted(false); // Remove border
        closeButton.setFocusPainted(false); // Remove focus painting
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close this frame
            }
        });

        // Set bounds for the components
        gbc.gridy = 0; // Row 0 for username label
        frame.add(usernameLabel, gbc);

        gbc.gridy = 1; // Row 1 for username field
        frame.add(usernameField, gbc);

        gbc.gridy = 2; // Row 2 for password label
        frame.add(passwordLabel, gbc);

        gbc.gridy = 3; // Row 3 for password field
        frame.add(passwordField, gbc);

        gbc.gridy = 4; // Row 4 for login button
        frame.add(loginButton, gbc);

        gbc.gridy = 5; // Row 5 for close button
        frame.add(closeButton, gbc);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure GUI is created on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}
