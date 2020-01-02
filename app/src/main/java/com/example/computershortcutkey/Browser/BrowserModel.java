package com.example.computershortcutkey.Browser;

public class BrowserModel {



    private String Title;

    private int Thumbnail;

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public BrowserModel(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }
}
