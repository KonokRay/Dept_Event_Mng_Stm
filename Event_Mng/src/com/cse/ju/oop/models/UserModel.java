package com.cse.ju.oop.models;

public class UserModel {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String batch;
    private String rollNumber;
    private String session;
    private String role; // admin or user

    // Constructor
    public UserModel(String name, String email, String password, String phoneNumber,
                      String batch, String rollNumber, String session, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.batch = batch;
        this.rollNumber = rollNumber;
        this.session = session;
        this.role = role;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public String getSession() { return session; }
    public void setSession(String session) { this.session = session; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
