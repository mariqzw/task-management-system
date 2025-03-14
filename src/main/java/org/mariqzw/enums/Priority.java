package org.mariqzw.enums;

public enum Priority {
    High("High", 0),
    Medium("Medium", 1),
    Low("Low", 2);

    private String priorityName;
    private int number;

    private Priority(String priorityName, int number) {
    }
}
