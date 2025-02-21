package org.example.User;

public class Person {
    private String name;
    private int quantity;

    public Person(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
