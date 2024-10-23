package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiveAccessFrame extends JFrame {

    public GiveAccessFrame() {
        // Set up the frame
        setTitle("Give Access");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this frame only
        setSize(400, 200); // Set size of the frame
        setLocationRelativeTo(null); // Center the frame
        setLayout(new GridBagLayout()); // Use GridBagLayout for custom positioning
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding for components

        // Create labels and text fields for username and password
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15); // Text field for username
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15); // Password field

        // Create Submit button
        JButton submitButton = new JButton("Submit");

        // Action listener for Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Here, you can add logic to save the new admin details
                // For now, we'll just display a confirmation message
                JOptionPane.showMessageDialog(GiveAccessFrame.this,
                        "New admin added:\nUsername: " + username + "\nPassword: " + password,
                        "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear the fields after submission
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        // Set constraints and add components to the frame
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.anchor = GridBagConstraints.WEST; // Align to the left
        add(usernameLabel, gbc); // Add username label

        gbc.gridx = 1; // Column 1
        add(usernameField, gbc); // Add username text field

        gbc.gridx = 0; // Column 0
        gbc.gridy = 1; // Row 1
        add(passwordLabel, gbc); // Add password label

        gbc.gridx = 1; // Column 1
        add(passwordField, gbc); // Add password field

        gbc.gridx = 0; // Column 0
        gbc.gridy = 2; // Row 2
        gbc.gridwidth = 2; // Span across two columns
        gbc.anchor = GridBagConstraints.CENTER; // Center the button
        add(submitButton, gbc); // Add submit button

        // Set frame visibility
        setVisible(true);
    }
}
