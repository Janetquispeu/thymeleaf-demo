package org.example.User;

public class Receiver {
    private String name;
    private String email;
    private  String phoneNumber;
    private String district;
    private String address;
    private String reference;

    // Constructor
    public Receiver(
            String name,
            String email,
            String phoneNumber,
            String district,
            String address,
            String reference
    ) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.district = district;
        this.address = address;
        this.reference = reference;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getDistrict() {
        return district;
    }
    public String getAddress() {
        return address;
    }
    public String getReference() {
        return reference;
    }
}
