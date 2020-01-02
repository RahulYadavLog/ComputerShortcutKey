package com.example.computershortcutkey.Shortcut;

public class ShortcutModel {

    private String Title;

    private int Thumbnail;

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public ShortcutModel(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }
}
