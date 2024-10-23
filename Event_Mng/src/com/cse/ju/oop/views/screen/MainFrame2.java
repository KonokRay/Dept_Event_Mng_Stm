package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame2 extends JFrame {

    public MainFrame2() {
        // Set up the frame
        setTitle("Admin Options");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this frame only
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize frame to fullscreen
        setLocationRelativeTo(null); // Center the frame
        setLayout(new GridBagLayout()); // Use GridBagLayout for custom positioning

        // Create GridBagConstraints with no padding or extra space
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 0, 0); // No padding between components
        gbc.gridx = 0; // Center in column 0
        gbc.fill = GridBagConstraints.NONE; // Do not stretch components
        gbc.anchor = GridBagConstraints.CENTER; // Center everything

        // Create Login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 20)); // Set font size

        // Action listener for Login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginFrame(); // Open the login frame
                dispose(); // Close this frame
            }
        });

        // Create label for Give Access option
        JLabel giveAccessLabel = new JLabel("Give Access");
        giveAccessLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Adjust font size
        giveAccessLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Change cursor on hover

        // Action listener for Give Access label
        giveAccessLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new GiveAccessFrame(); // Open Give Access frame
            }
        });

        // Create a close button styled as a red cross
        JButton closeButton = new JButton("X");
        closeButton.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size
        closeButton.setForeground(Color.RED); // Set text color to red
        closeButton.setContentAreaFilled(false); // Make it transparent
        closeButton.setBorderPainted(false); // Remove border
        closeButton.setFocusPainted(false); // Remove focus painting

        // Action listener for close button
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close this frame
            }
        });

        // Set constraints and add components without any space
        gbc.gridy = 0; // Row 0 for the login button
        add(loginButton, gbc); // Add Login button

        gbc.gridy = 1; // Row 1 for the Give Access label
        add(giveAccessLabel, gbc); // Add Give Access label

        gbc.gridy = 2; // Row 2 for the Close button
        add(closeButton, gbc); // Add close button

        // Set frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure GUI is created on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new MainFrame2());
    }
}
