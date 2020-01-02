package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class IllustratorActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    IllustratorAdapter recyclerViewAdapter;

    ArrayList<IllustratorModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illustrator);




            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Illustrator Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new IllustratorModel("Alt+Click Layer :-","Select All Items On Layer",R.drawable.illust));
        lstBook.add(new IllustratorModel("SpaceBar :-","Hand Tool",R.drawable.illust));
        lstBook.add(new IllustratorModel("Ctrl+SpaceBar (then let go of control):-","Hand Tool (Editing Type)",R.drawable.illust));
        lstBook.add(new IllustratorModel("Ctrl+SpaceBar:-","Zoom in Tool",R.drawable.illust));
        lstBook.add(new IllustratorModel("Ctrl+Alt+SpaceBar :-","Zoom Out Tool",R.drawable.illust));




        lstBook.add(new IllustratorModel("Ctrl :-","Access Selection Or Direction Selection tool",R.drawable.illust));
        lstBook.add(new IllustratorModel("Shift+Arrow direction :-","Move Selection !0 pts",R.drawable.illust));
        lstBook.add(new IllustratorModel("Shift:-","To Add to a Selection",R.drawable.illust));
        lstBook.add(new IllustratorModel("Ctrl+2 :-","Lock Select artwork",R.drawable.illust));

        lstBook.add(new IllustratorModel("Ctrl+Alt+2 :-","Unlock All artwork",R.drawable.illust));
        lstBook.add(new IllustratorModel("Alt+drag:-","Duplicate and Transform Selection",R.drawable.illust));
        lstBook.add(new IllustratorModel("Shift Drag Bounding Box :-","Scale Proportionally With Selection tool",R.drawable.illust));
        lstBook.add(new IllustratorModel("I :-","Sample Intermediate Color ",R.drawable.illust));


        lstBook.add(new IllustratorModel("Ctrl+Shift+or :-","Decreasing/Increasing Type Size",R.drawable.illust));
        lstBook.add(new IllustratorModel("Alt+Up/Down:-","Decrease/Increase leading",R.drawable.illust));
        lstBook.add(new IllustratorModel("Alt+Arrow+L/R:-","Decrease/Increase Kerning or tracking or Tracking",R.drawable.illust));
        lstBook.add(new IllustratorModel("Ctrl+Shift+L/C/R :-","Align Text left/center/right",R.drawable.illust));
        lstBook.add(new IllustratorModel("Ctrl+Shift+Alt+S :-","Save For Web and Device",R.drawable.illust));





        recyclerView = (RecyclerView) findViewById(R.id.illustrator);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new IllustratorAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
