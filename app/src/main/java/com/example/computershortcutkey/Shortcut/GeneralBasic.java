package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class GeneralBasic extends AppCompatActivity {



    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    GeneralBasicAdapter recyclerViewAdapter;

    ArrayList<GeneralBasicModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_basic);



            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Basic Shortcut Keys");
            setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();
        lstBook.add(new GeneralBasicModel("CTRL + c :-","Copy selected Item",R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("CTRL + X :-","Cut Selected Item", R.drawable.shortcut));

        lstBook.add(new GeneralBasicModel("CTRL + V :-","Paste Clipbord Item",R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("DEL :-","Delete Selected Item", R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("CTRL + Z :-","Undo",R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("CTRL + Y :-","Redo", R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("CTRL + A :-","Select All",R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("CTRL + P :-","Print", R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("CTRL + ALT + DEL :-","Open Task Manager",R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("SHIFT + DEL :-","Permanent Delete", R.drawable.shortcut));

        lstBook.add(new GeneralBasicModel("F5 :-","Refresh The Active Window",R.drawable.shortcut));
        lstBook.add(new GeneralBasicModel("F2 :-","Rename Selected Item", R.drawable.shortcut));


        recyclerView = (RecyclerView) findViewById(R.id.general);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new GeneralBasicAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);

        return true;
    }
}
