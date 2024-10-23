package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontCoverScreen {

    public void showFrontCover() {
        // Create a JFrame for the front cover
        JFrame frame = new JFrame("Departmental Events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true); // Remove window decorations

        // Set to fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame
        frame.setVisible(true); // Make the frame visible first to apply full screen

        // Create JPanel with a GridBagLayout for centering components
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding for each component

        // Load the full-width image
        ImageIcon headerImage = new ImageIcon(getClass().getResource("/com/cse/ju/oop/resources/eventmng.png")); // Update the path to your image
        JLabel imageLabel = new JLabel(headerImage);
        imageLabel.setPreferredSize(new Dimension(frame.getWidth(), 200)); // Set preferred height
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally
        panel.add(imageLabel, gbc); // Add image label

        // Create title label
        JLabel titleLabel = new JLabel("Event Management", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 50)); // Set font size and style
        titleLabel.setForeground(Color.BLUE); // Set the heading color to blue
        gbc.gridy = 1; // Row 1
        gbc.fill = GridBagConstraints.NONE; // Reset fill to none
        panel.add(titleLabel, gbc); // Add title label

        // Create department label
        JLabel departmentLabel = new JLabel("Department of Computer Science & Engineering", JLabel.CENTER);
        departmentLabel.setFont(new Font("Arial", Font.ITALIC, 16)); // Set font for department
        gbc.gridy = 2; // Row 2
        panel.add(departmentLabel, gbc); // Add department label

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // Use FlowLayout to place buttons side by side

        // Create Admin and User buttons
        JButton adminButton = new JButton("Admin");
        JButton userButton = new JButton("User");

        // Customize button fonts and sizes
        adminButton.setFont(new Font("Arial", Font.PLAIN, 16)); // Smaller font size
        userButton.setFont(new Font("Arial", Font.PLAIN, 16)); // Smaller font size

        // Add Action Listeners to the buttons
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open MainFrame2 for Admin
                new MainFrame2(); // This should be your class for MainFrame2
                frame.dispose(); // Close the current frame
            }
        });

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open MainFrame for User
                new MainFrame(); // Assuming MainFrame is for User actions
                frame.dispose(); // Close current frame
            }
        });

        // Add buttons to the button panel
        buttonPanel.add(adminButton); // Add admin button
        buttonPanel.add(userButton); // Add user button

        // Add button panel to the main panel
        gbc.gridy = 3; // Row 3
        panel.add(buttonPanel, gbc); // Add button panel to the grid

        // Add the main panel to the frame
        frame.add(panel);

        // Set the frame to fullscreen mode after adding components
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize frame again if needed
        frame.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure GUI creation happens on the EDT
        SwingUtilities.invokeLater(() -> {
            FrontCoverScreen screen = new FrontCoverScreen();
            screen.showFrontCover();
        });
    }
}
