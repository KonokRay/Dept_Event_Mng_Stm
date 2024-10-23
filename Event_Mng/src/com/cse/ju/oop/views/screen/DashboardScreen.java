package com.cse.ju.oop.views.screen;

import javax.swing.*;

public class DashboardScreen {

    public void showDashboard() {
        JFrame frame = new JFrame("Welcome");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton pastEventsButton = new JButton("Past Events");
        JButton upcomingEventsButton = new JButton("Upcoming Events");

        panel.add(pastEventsButton);
        panel.add(upcomingEventsButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
