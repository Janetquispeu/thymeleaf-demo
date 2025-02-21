package org.example.NewSeller;

public class categoryCommissions {
    private String months;
    private String validity;
    private String name;
    private String amount;

    public categoryCommissions(
       String months,
       String validity,
       String name,
       String amount
    ) {
        this.months = months;
        this.validity = validity;
        this.name = name;
        this.amount = amount;
    }

    public String getMonths() {
        return months;
    }

    public String getValidity() {
        return validity;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }
}
