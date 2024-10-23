package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListScreen {
    private JFrame frame;
    private JTextField eventNameField, eventDateField, eventLocationField;
    private JButton addEventButton, addUserButton;

    public EventListScreen() {
        frame = new JFrame("Event Management");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        eventNameField = new JTextField();
        eventDateField = new JTextField();
        eventLocationField = new JTextField();
        addEventButton = new JButton("Add Event");
        addUserButton = new JButton("Add User");

        eventNameField.setBounds(50, 30, 300, 30);
        eventDateField.setBounds(50, 70, 300, 30);
        eventLocationField.setBounds(50, 110, 300, 30);
        addEventButton.setBounds(50, 150, 140, 30);
        addUserButton.setBounds(210, 150, 140, 30);

        frame.add(eventNameField);
        frame.add(eventDateField);
        frame.add(eventLocationField);
        frame.add(addEventButton);
        frame.add(addUserButton);

        // Action Listener for addEventButton
        addEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to add the event (not implemented in this snippet)
                JOptionPane.showMessageDialog(frame, "Event adding functionality not implemented yet.");
            }
        });

        // Action Listener for addUserButton
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame(); // Open MainFrame for login/signup
                frame.dispose(); // Close EventListScreen
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EventListScreen();
    }
}
