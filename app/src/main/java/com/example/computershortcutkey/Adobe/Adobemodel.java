package com.example.computershortcutkey.Adobe;

public class Adobemodel {

    private String Title;

    private int Thumbnail;

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public Adobemodel(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }
}
