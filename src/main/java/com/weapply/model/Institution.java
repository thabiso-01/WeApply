package com.weapply.model;

public class Institution {
    private String name;
    private String address;
    private String type;

    // Constructor
    public Institution(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}