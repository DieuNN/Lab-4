package com.example.lab4;

public class Contact {
    private String name;
    private String phoneNumber;
    private String description;
    private int image;

    public Contact() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Contact(String name, String phoneNumber, String description, int image) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
