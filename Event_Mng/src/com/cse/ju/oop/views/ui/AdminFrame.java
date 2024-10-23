package com.cse.ju.oop.views.ui;

import javax.swing.*;

public class AdminFrame extends JFrame {

    public AdminFrame() {
        // Set the title of the window
        setTitle("Admin Panel");

        // Set the size of the window
        setSize(300, 200);

        // Set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a label for admin functionality
        JLabel label = new JLabel("Welcome to the Admin Panel!", SwingConstants.CENTER);
        add(label);

        // Center the window on the screen
        setLocationRelativeTo(null);
    }
}
