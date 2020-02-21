package com.example.demo.account.model.enumeration;

public enum Role {

    ADMIN("Administrator"),
    EMPLOYEE("Employee"),
    CLIENT("Client"),
    TECHNICAL("Technical");

    private String abbreviation ;

    Role(String abbreviation) {
        this.abbreviation = abbreviation ;
    }

    public String getAbbreviation() {
        return  this.abbreviation ;
    }
}
