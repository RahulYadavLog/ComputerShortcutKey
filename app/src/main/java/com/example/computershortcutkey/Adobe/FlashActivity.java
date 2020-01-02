package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.DreamWeaverAdapter;
import com.example.computershortcutkey.DreamWeaverModel;
import com.example.computershortcutkey.FlashAdapter;
import com.example.computershortcutkey.FlashModel;
import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class FlashActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
FlashAdapter recyclerViewAdapter;

    ArrayList<FlashModel> lstBook;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);







            toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Flash Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new FlashModel("Ctrl+F :-", "Find", R.drawable.flash));
        lstBook.add(new FlashModel("F3 :-", "Find Again", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+G :-", "Go To line ", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+U :-", "Preference", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+Shift+8 :-", "Hidden Character ", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+Shift+W :-", "Word Wrap", R.drawable.flash));




        lstBook.add(new FlashModel("F4 :-", "Hide Panels", R.drawable.flash));
        lstBook.add(new FlashModel("Alt+F5 :-", "Debug Continue", R.drawable.flash));
        lstBook.add(new FlashModel("Alt+F12 :-", "End Debug Session", R.drawable.flash));
        lstBook.add(new FlashModel("Alt+F6 :-", "Step In", R.drawable.flash));
        lstBook.add(new FlashModel("Alt+F7 :-", "Step Over", R.drawable.flash));

        lstBook.add(new FlashModel("Alt+F8 :-", "Step Out", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+B :-", "Toggle BreakPoint", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+Shift+B :-", "Remove all Break Point", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+Alt+T :-", "Time Line", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+F2 :-", "Tool", R.drawable.flash));

        lstBook.add(new FlashModel("Ctrl+F3 :-", "Properties", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+L,F11 :-", "Library", R.drawable.flash));
        lstBook.add(new FlashModel("F2 :-", "Output", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+K :-", "Align", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+Shift+F9 :-", "Color", R.drawable.flash));

        lstBook.add(new FlashModel("Ctrl+I :-", "Info", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+F9 :-", "Swatches", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+T :-", "TransForm", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+F7 :-", "TransForm", R.drawable.flash));
        lstBook.add(new FlashModel("Shift+F7 :-", "Component Inspector", R.drawable.flash));

        lstBook.add(new FlashModel("Alt+Shift+F11 :-", "Accessibility", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+F10 :-", "History", R.drawable.flash));
        lstBook.add(new FlashModel("Shift+F2 :-", "Scene", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+F11 :-", "String", R.drawable.flash));
        lstBook.add(new FlashModel("Ctrl+Shift+F10 :-", "Web Service", R.drawable.flash));


        recyclerView = (RecyclerView) findViewById(R.id.flash);

            layoutManager = new GridLayoutManager(this, 1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter = new FlashAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
