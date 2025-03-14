package org.mariqzw.enums;

public enum RoleEnum {
    User ("User", 0),
    Admin ("Admin", 1);

    private String type;
    private int number;

    RoleEnum(String type, int number) {
    }
}
