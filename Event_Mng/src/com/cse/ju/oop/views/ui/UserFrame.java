package com.cse.ju.oop.views.ui;

import javax.swing.*;

public class UserFrame extends JFrame {

    public UserFrame() {
        // Set the title of the window
        setTitle("User Panel");

        // Set the size of the window
        setSize(300, 200);

        // Set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a label for user functionality
        JLabel label = new JLabel("Welcome to the User Panel!", SwingConstants.CENTER);
        add(label);

        // Center the window on the screen
        setLocationRelativeTo(null);
    }
}
