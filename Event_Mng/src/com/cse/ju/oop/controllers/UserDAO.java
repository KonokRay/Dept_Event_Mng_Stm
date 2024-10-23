package com.cse.ju.oop.controller;

import com.cse.ju.oop.models.UserModel;
import com.cse.ju.oop.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public void addUser(UserModel user) {
        String query = "INSERT INTO users (name, email, password, phoneNumber, batch, rollNumber, session, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getPhoneNumber());
            preparedStatement.setString(5, user.getBatch());
            preparedStatement.setString(6, user.getRollNumber());
            preparedStatement.setString(7, user.getSession());
            preparedStatement.setString(8, user.getRole());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
