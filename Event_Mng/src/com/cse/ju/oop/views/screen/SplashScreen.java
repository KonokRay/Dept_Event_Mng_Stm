package com.cse.ju.oop.views.screen;

import javax.swing.*;
import java.awt.*;

public class SplashScreen {

    public void showSplash() {
        // Create a JFrame for the splash screen
        JFrame splashFrame = new JFrame("Splash Screen");
        splashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        splashFrame.setUndecorated(true); // Remove window decorations

        // Set to fullscreen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        splashFrame.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); // Set cursor to wait

        // Load the splash image
        ImageIcon splashImage = new ImageIcon(getClass().getResource("/com/cse/ju/oop/resources/start.jpg")); // Ensure the path is correct
        JLabel splashLabel = new JLabel(splashImage);
        splashLabel.setLayout(new BorderLayout());
        splashFrame.add(splashLabel);

        // Set the splash frame to fullscreen
        splashFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize to cover entire screen
        splashFrame.setVisible(true); // Make the splash screen visible

        // Optional: Set the splashFrame to fullscreen exclusive mode
        gd.setFullScreenWindow(splashFrame);

        // Timer to close the splash screen after 0.5 seconds (500 milliseconds)
        Timer timer = new Timer(500, e -> {
            gd.setFullScreenWindow(null); // Exit fullscreen mode
            splashFrame.dispose(); // Close the splash screen
            new FrontCoverScreen().showFrontCover(); // Show the front cover screen
        });
        timer.setRepeats(false); // Only execute once
        timer.start(); // Start the timer
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SplashScreen splash = new SplashScreen();
            splash.showSplash(); // Show the splash screen
        });
    }
}
