package com.example.computershortcutkey.Office;

public class Msofficemodel {

    private String Title;

    private int Thumbnail;

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public Msofficemodel(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }
}
