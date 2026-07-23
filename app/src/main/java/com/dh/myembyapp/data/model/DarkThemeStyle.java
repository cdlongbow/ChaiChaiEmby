package com.dh.myembyapp.data.model;

public enum DarkThemeStyle {
    PURE_BLACK("pure_black", "纯黑"),
    EMBER_ORANGE("ember_orange", "余烬暗橙"),
    OBSIDIAN_VIOLET("obsidian_violet", "曜石暗紫"),
    MIDNIGHT_BLUE("midnight_blue", "子夜深蓝"),
    PINE_GREEN("pine_green", "松影暗绿"),
    GRAPHITE("graphite", "石墨深灰"),
    NOIR_MAGENTA("noir_magenta", "暗夜品红");

    private final String storageValue;
    private final String displayName;

    DarkThemeStyle(String storageValue, String displayName) {
        this.storageValue = storageValue;
        this.displayName = displayName;
    }

    public String getStorageValue() {
        return storageValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static DarkThemeStyle fromStorageValue(String value) {
        for (DarkThemeStyle s : values()) {
            if (s.storageValue.equals(value)) return s;
        }
        return PURE_BLACK;
    }

    public static DarkThemeStyle getDefault() {
        return PURE_BLACK;
    }
}