package com.codesoom.assignment;

public class IdGenerator {
    private static Long id = 0L;

    private IdGenerator() {
    }

    public static synchronized Long createId() {
        id = id + 1;
        return id;
    }
}
