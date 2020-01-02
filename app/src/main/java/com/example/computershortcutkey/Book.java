package com.example.computershortcutkey;

public class Book {


    private String Title;

    private int Thumbnail;

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public Book(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }
}
