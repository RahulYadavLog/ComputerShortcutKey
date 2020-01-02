package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsPaintActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsPaintAdapter recyclerViewAdapter;

    ArrayList<MsPaintModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_paint);




            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Ms Access Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();
            lstBook.add(new MsPaintModel("Ctrl+N :-","New Picture",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+O :-","Open Picture",R.drawable.paint2));

        lstBook.add(new MsPaintModel("Ctrl+C :-","Copy Selected Item",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+X :-","Cut Selected Items",R.drawable.paint2));

        lstBook.add(new MsPaintModel("Ctrl+V :-","Paste",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Del :-","Delete",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+Z :-","Undo",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+Y :-","Redo",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+P :-","Print Picture",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Esc :-","Cancel Selection",R.drawable.paint2));



        lstBook.add(new MsPaintModel("Ctrl++ :-","Increase The width of a brush line,or shape",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+E :-","Open The Property dialog box",R.drawable.paint2));

        lstBook.add(new MsPaintModel("Ctrl+W :-","Open the Resize and Skew Dialog box",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+Page Up :-","Zoom in",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+Page down :-","Zoom out",R.drawable.paint2));
        lstBook.add(new MsPaintModel("F11 :-","View a picture in full-screen mode",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+R :-","Show or Hide Ruler",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+G :-","Show or Hide Gridlines",R.drawable.paint2));

        lstBook.add(new MsPaintModel("Ctrl+B :-","Bold",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+I :-","Italic",R.drawable.paint2));
        lstBook.add(new MsPaintModel("Ctrl+U :-","Under Line",R.drawable.paint2));



        recyclerView = (RecyclerView) findViewById(R.id.paint);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new MsPaintAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
        }

    }
