package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.*;

public class FrontCoverScreen {

    public void showFrontCover() {
        // Create JFrame
        JFrame frame = new JFrame("Departmental Events");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Create JPanel with a BorderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Add a label
        JLabel label = new JLabel("Departmental Events", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(label, BorderLayout.NORTH);

        // Create Admin and User buttons
        JButton adminButton = new JButton("Admin");
        JButton userButton = new JButton("User");

        // Customize button fonts
        adminButton.setFont(new Font("Arial", Font.PLAIN, 16));
        userButton.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add buttons to a new panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(adminButton);
        buttonPanel.add(userButton);

        // Add the button panel to the main panel
        panel.add(buttonPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure GUI creation happens on the EDT
        SwingUtilities.invokeLater(() -> {
            FrontCoverScreen screen = new FrontCoverScreen();
            screen.showFrontCover();
        });
    }
}
