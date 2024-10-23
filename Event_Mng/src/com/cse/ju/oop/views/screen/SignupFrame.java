package com.cse.ju.oop.views.screen;

import com.cse.ju.oop.controller.UserDAO;
import com.cse.ju.oop.models.UserModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupFrame {
    private JFrame frame;

    public SignupFrame() {
        frame = new JFrame("Sign Up");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField phoneNumberField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JTextField rollField = new JTextField();
        JTextField sessionField = new JTextField();
        JTextField roleField = new JTextField("user"); // Default role

        JButton signupButton = new JButton("Sign Up");

        nameField.setBounds(50, 30, 300, 30);
        emailField.setBounds(50, 70, 300, 30);
        phoneNumberField.setBounds(50, 110, 300, 30);
        passwordField.setBounds(50, 150, 300, 30);
        rollField.setBounds(50, 190, 300, 30);
        sessionField.setBounds(50, 230, 300, 30);
        roleField.setBounds(50, 270, 300, 30);
        signupButton.setBounds(50, 310, 300, 30);

        frame.add(nameField);
        frame.add(emailField);
        frame.add(phoneNumberField);
        frame.add(passwordField);
        frame.add(rollField);
        frame.add(sessionField);
        frame.add(roleField);
        frame.add(signupButton);

        // Action listener for signup button
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phoneNumber = phoneNumberField.getText();
                String password = String.valueOf(passwordField.getPassword());
                String roll = rollField.getText();
                String session = sessionField.getText();
                String role = roleField.getText();

                // Create a UserModel object
                UserModel user = new UserModel(name, email, password, phoneNumber, "", roll, session, role);

                UserDAO userDAO = new UserDAO();
                userDAO.addUser(user);

                JOptionPane.showMessageDialog(frame, "User registered successfully!");
                frame.dispose(); // Close signup frame
            }
        });

        frame.setVisible(true);
    }
}
