package com.cse.ju.oop.models;

public class EventModel {
    private String eventID;
    private String eventName;
    private String eventDate;
    private String eventLocation;
    private String description;
    private String organizer;
    private String eventStatus; // upcoming or past

    // Constructor
    public EventModel(String eventID, String eventName, String eventDate,
                       String eventLocation, String description, String organizer, String eventStatus) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.description = description;
        this.organizer = organizer;
        this.eventStatus = eventStatus;
    }

    // Getters and Setters
    public String getEventID() { return eventID; }
    public void setEventID(String eventID) { this.eventID = eventID; }

    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public String getEventDate() { return eventDate; }
    public void setEventDate(String eventDate) { this.eventDate = eventDate; }

    public String getEventLocation() { return eventLocation; }
    public void setEventLocation(String eventLocation) { this.eventLocation = eventLocation; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getOrganizer() { return organizer; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }

    public String getEventStatus() { return eventStatus; }
    public void setEventStatus(String eventStatus) { this.eventStatus = eventStatus; }
}
