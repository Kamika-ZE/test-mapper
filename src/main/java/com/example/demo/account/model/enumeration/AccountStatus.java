package com.example.demo.account.model.enumeration;

public enum AccountStatus {

    PENDING("Pending"),
    ACTIVE("Active"),
    DISABLED("Disabled"),
    DELETED("Deleted"),
    INVALID("Invalid");

    private final String label;

    AccountStatus(String label){
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
