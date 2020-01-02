package com.example.computershortcutkey.Browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class ChromeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ChromeAdapter recyclerViewAdapter;

    ArrayList<ChromeModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrome);

        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Chrome Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new ChromeModel("Ctrl+N :-","Open new Window",R.drawable.chrom));
        lstBook.add(new ChromeModel("Ctrl+T :-","Open a new Tab",R.drawable.chrom));
        lstBook.add(new ChromeModel("Ctrl+Shift+N :-","Open a mew window in incognito mode",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+O,then select file :-","Open a file from your computer in Google Chrome",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl and click a link :-","Open a link in a new tab in the background",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+shift and click a link :-","Open the link in a new tab and switch to the newly open tab",R.drawable.crome2));
        lstBook.add(new ChromeModel("Shift and click a link :-","Open the link in a new window",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+Shift+T :-","Reopen The last Tab you Have Closed Google Chrome Remembers the last 10 tab you have to close",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+1 through Ctrl+8 :-","Switch to Tab to The Specified Position number on the tab strip",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+9 :-","Switch To The last Tab",R.drawable.crome2));
        lstBook.add(new ChromeModel("Press Backspace or Alt and the left Arrow together :-","Goes To The Previous Page in your Browsing History for the tab",R.drawable.crome2));
        lstBook.add(new ChromeModel("F10 :-","Open the Chrome menu",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+Shift+B :-","Toggles the bookmarks bar on and off",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+H :-","Open The History Page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+J :-","Open The Download Page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Shift+Esc :-","Open the task manager",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+Shift+J :-","Open Developer Tools",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+shift +Delete :-","Opens the Clear Browsing data dialog ",R.drawable.crome2));




        lstBook.add(new ChromeModel("F1 :-","Open the help Center ina new tab (our favorite)",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+L or Alt+D :-","Highlights the Url",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+P :-","print Your Current Page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+S :-","Save Your Current page",R.drawable.crome2));
        lstBook.add(new ChromeModel("F5 or Ctrl+R:-","Reload your current page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Esc :-","Stop the loading of your current page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+F :-","Open The Find bar ",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+D :-","Save your current WebPage as a Book marks",R.drawable.crome2));
        lstBook.add(new ChromeModel("F11 :-","Open Your the page in full Screen mode Press F11 again to Exit full-screen",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl and + :-","Enlarger everything on the page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+and - :-","Makes Everything on the page smaller",R.drawable.crome2));
        lstBook.add(new ChromeModel("Ctrl+0 :-"," Return Every Think on the Page to the Normal Size",R.drawable.crome2));
        lstBook.add(new ChromeModel("Space bar :-","Scroll Down the web pages",R.drawable.crome2));
        lstBook.add(new ChromeModel("Home :-","Goes to The Top of The pages",R.drawable.crome2));
        lstBook.add(new ChromeModel("End :-","Goes To the Bottom of the page",R.drawable.crome2));
        lstBook.add(new ChromeModel("Shift and Scroll your MouseWheel :-","Scrolls Horizontally on The pages",R.drawable.crome2));
        recyclerView = (RecyclerView) findViewById(R.id.chrome);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new ChromeAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
