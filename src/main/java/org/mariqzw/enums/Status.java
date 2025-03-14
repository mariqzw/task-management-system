package org.mariqzw.enums;

public enum Status {
    IN_PROGRESS("In progress", 0),
    IN_WAITING("In waiting", 1),
    COMPLETED("Completed", 2),
    EXPIRED("Expired", 3);

    private String name;
    private int number;

    private Status(String name, int number) {
    }
}
