package com.cse.ju.oop.controller;

import com.cse.ju.oop.models.EventModel;
import com.cse.ju.oop.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventDAO {
    public void addEvent(EventModel event) {
        String query = "INSERT INTO events (eventID, name, date, location, description, organizer, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Assuming eventID is generated or provided externally; if not, you can generate it here
            preparedStatement.setString(1, event.getEventID());
            preparedStatement.setString(2, event.getEventName());
            preparedStatement.setString(3, event.getEventDate());
            preparedStatement.setString(4, event.getEventLocation());
            preparedStatement.setString(5, event.getDescription());
            preparedStatement.setString(6, event.getOrganizer());
            preparedStatement.setString(7, event.getEventStatus());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
