package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class NotePadActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
  NodepadAdapter recyclerViewAdapter;

    ArrayList<NotePadModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_pad);



        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("NotePade Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new NotePadModel("CTRL + N :-","Create New Document",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + P :-","Display Print dialog box",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + O :-","Display Open File dialog box",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + S :-","Save Current Document",R.drawable.notepad));

        lstBook.add(new NotePadModel("CTRL + SHIFT + S :-","Save all open Document",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + W :-","Close Current Document",R.drawable.notepad));
        lstBook.add(new NotePadModel("ALT + C :-","Column editor",R.drawable.notepad));
        lstBook.add(new NotePadModel("TAB :-","Increase line indent",R.drawable.notepad));

        lstBook.add(new NotePadModel("SHIFT + TAB :-","Decrease line indent",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + SHIFT + U :-","Convert To Upper Case",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + U :-","Convert to lover case ",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + D :-","Duplicate current line",R.drawable.notepad));







        lstBook.add(new NotePadModel("CTRL + Q :-","Toggle block comment",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + K :-","Block Comment",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + SHIFT + K :-","Block uncomment",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + SHIFT + Q :-","Stream comment",R.drawable.notepad));

        lstBook.add(new NotePadModel("CTRL + Space :-","Function completion ",R.drawable.notepad));
        lstBook.add(new NotePadModel("Ctrl + Enter :-","Word completion ",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + F :-","Find",R.drawable.notepad));
        lstBook.add(new NotePadModel("F3 :-","Find Next",R.drawable.notepad));


        lstBook.add(new NotePadModel("Shift + F3 :-","Find Previous",R.drawable.notepad));
        lstBook.add(new NotePadModel("Ctrl + H :-","Replace",R.drawable.notepad));
        lstBook.add(new NotePadModel("CTRL + F2 :-","Toggle bookmarks ",R.drawable.notepad));
        lstBook.add(new NotePadModel("F2:-","Next bookmarks",R.drawable.notepad));
        lstBook.add(new NotePadModel("Shift + F2:-","Previous bookmarks",R.drawable.notepad));



        recyclerView = (RecyclerView) findViewById(R.id.notepad);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new NodepadAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
