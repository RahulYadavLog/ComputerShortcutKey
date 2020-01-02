package com.example.computershortcutkey;

public class CorelDrawModel {

    private String Title;

    private String Discription;
    private int Thumbnail;

    public String getTitle() {
        return Title;
    }

    public String getDiscription() {
        return Discription;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public CorelDrawModel(String title, String discription, int thumbnail) {
        Title = title;
        Discription = discription;
        Thumbnail = thumbnail;
    }
}
