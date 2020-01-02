package com.example.computershortcutkey.Browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class ExplorerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ExplorerAdapter recyclerViewAdapter;

    ArrayList<ExplorerModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorer);





            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Explorer Shortcut Keys");
            setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();




        lstBook.add(new ExplorerModel("Ctrl+A :-","Select All Items",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+D :-","Add The current Page to Your Favorites",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+E :-","Open The Search bar",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+F :-","Find On This Page",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+H :-","Open The History Bar",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+I :-","Open Favorites Bar",R.drawable.explorer));


        lstBook.add(new ExplorerModel("Ctrl+N :-","Open a new Window",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+O :-","Go to NeW location",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+P :-","Print The current Page or Active frame",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+S :-","Save The Current Page",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Ctrl+W  :-","Close Current Browser Window",R.drawable.explorer));

        lstBook.add(new ExplorerModel("Ctrl+Enter:-","Quickly Complete an Address For Example http://www.(url).com",R.drawable.explorer));
        lstBook.add(new ExplorerModel("Shift+Click :-","Open Link in a new Window",R.drawable.explorer));

        lstBook.add(new ExplorerModel("BackSpace :-","Go to The Previous Page",R.drawable.explorer));
        lstBook.add(new ExplorerModel("F11 :-","Toggle Full Screen View page",R.drawable.explorer));
        lstBook.add(new ExplorerModel("F5 :-","Refresh The Current Page",R.drawable.explorer));


        recyclerView = (RecyclerView) findViewById(R.id.explorer);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new ExplorerAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
