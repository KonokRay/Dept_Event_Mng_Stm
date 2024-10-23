package com.cse.ju.oop.views.screen;

import javax.swing.*;

public class EventScreen {

    public void showAdminScreen() {
        JFrame frame = new JFrame("Admin - Manage Events");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton upcomingButton = new JButton("Upcoming Events");
        JButton pastButton = new JButton("Past Events");
        JButton createButton = new JButton("Create New Event");
        JButton scheduleButton = new JButton("Scheduling");

        upcomingButton.addActionListener(e -> {
            // Show list of upcoming events
        });

        createButton.addActionListener(e -> {
            // Open new event creation form
        });

        panel.add(upcomingButton);
        panel.add(pastButton);
        panel.add(createButton);
        panel.add(scheduleButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
