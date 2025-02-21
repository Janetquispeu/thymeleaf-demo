package org.example.NewSeller;
import org.example.User.Person;

import java.util.List;

public class ecommerces {
    private String totalPieces;
    private List<Person> pieces;

    // Constructor
    public ecommerces(
            String totalPieces,
            List<Person> pieces
    ) {
        this.totalPieces = totalPieces;
        this.pieces = pieces;
    }

    // Getters
    public String getTotalPieces() {
        return totalPieces;
    }

    public List<Person> getPieces() {
        return pieces;
    }
}
