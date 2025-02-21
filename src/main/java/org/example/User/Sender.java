package org.example.User;

public class Sender {
    private String name;
    private String trackingNumber;
    private String ubigeo;
    private String date;
    private String phoneNumber;
    private String address;
    private String reference;

    // Constructor
    public Sender(
            String name,
            String trackingNumber,
            String ubigeo,
            String date,
            String phoneNumber,
            String address,
            String reference
    ) {
        this.name = name;
        this.trackingNumber = trackingNumber;
        this.ubigeo = ubigeo;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.reference = reference;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
    public String getUbigeo() {
        return ubigeo;
    }

    public String getDate() {
        return date;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }

    public String getReference() {
        return reference;
    }
}
