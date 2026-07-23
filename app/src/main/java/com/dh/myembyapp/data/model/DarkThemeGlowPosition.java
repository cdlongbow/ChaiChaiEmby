package com.dh.myembyapp.data.model;

public enum DarkThemeGlowPosition {
    LEFT_TOP("left_top", "左上"),
    CENTER_TOP("center_top", "中上"),
    RIGHT_TOP("right_top", "右上");

    private final String storageValue;
    private final String displayName;

    DarkThemeGlowPosition(String storageValue, String displayName) {
        this.storageValue = storageValue;
        this.displayName = displayName;
    }

    public String getStorageValue() {
        return storageValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static DarkThemeGlowPosition fromStorageValue(String value) {
        for (DarkThemeGlowPosition p : values()) {
            if (p.storageValue.equals(value)) return p;
        }
        return LEFT_TOP;
    }

    public static DarkThemeGlowPosition getDefault() {
        return LEFT_TOP;
    }
}