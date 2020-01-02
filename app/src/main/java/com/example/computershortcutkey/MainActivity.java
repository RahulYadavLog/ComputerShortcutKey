package com.example.computershortcutkey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<Book> lstBook ;

    Toolbar     toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        lstBook = new ArrayList<>();
        lstBook.add(new Book("Shortcut",R.drawable.shortcut));
        lstBook.add(new Book("Browser", R.drawable.browser));
        lstBook.add(new Book("Ms Office", R.drawable.office3));
        lstBook.add(new Book("Adobe", R.drawable.adobe));


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new RecyclerViewAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);

        return true;
    }
}
