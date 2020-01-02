package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class WindowActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    WindowAdapter recyclerViewAdapter;

    ArrayList<WindowModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);



        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Window Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new WindowModel("WIN + E :-","Open File Explorer",R.drawable.window));

        lstBook.add(new WindowModel("ALT + TAB :-","Change Tab",R.drawable.window));

        lstBook.add(new WindowModel("WIN + F1 :-","Open Window Help",R.drawable.window));

        lstBook.add(new WindowModel("WIN + F :-","Window Search",R.drawable.window));

        lstBook.add(new WindowModel("WIN + R :-","Open Run Window",R.drawable.window));


        lstBook.add(new WindowModel("WIN + M :-","Minimize All Window",R.drawable.window));

        lstBook.add(new WindowModel("ALT + F4 :-","Close Current Window",R.drawable.window));

        lstBook.add(new WindowModel("ALT + F :-","Menu Option in current Program",R.drawable.window));

        lstBook.add(new WindowModel("F1:-","Universal Help",R.drawable.window));

        lstBook.add(new WindowModel("F2 :-","Rename a selected file",R.drawable.window));


        lstBook.add(new WindowModel("F5 :-","Refresh The Current Program window",R.drawable.window));

        lstBook.add(new WindowModel("CTRL + A :-","Select All Text",R.drawable.window));

        lstBook.add(new WindowModel("CTRL + S :-","Save Current document file",R.drawable.window));

        lstBook.add(new WindowModel("CTRL + X :-","Cut Selected Item",R.drawable.window));

        lstBook.add(new WindowModel("HOME :-","Goes to beginning of Current Line",R.drawable.window));

        lstBook.add(new WindowModel("CTRL + HOME:-","Goes to beginning of document",R.drawable.window));

        lstBook.add(new WindowModel("END :-","Goes to end of current line",R.drawable.window));

        recyclerView = (RecyclerView) findViewById(R.id.window);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new WindowAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.home, menu);
//
//        return true;

}
