package com.iitp.njack.iitp_connect.core.profile;

public enum UserFieldType {
    USERNAME("userName"),
    EMAIL("email"),
    FIRST_NAME("firstName"),
    LAST_NAME("lastName"),
    ROLL( "roll");

    public final String key;
    UserFieldType(String key) {
        this.key = key;
    }
}
