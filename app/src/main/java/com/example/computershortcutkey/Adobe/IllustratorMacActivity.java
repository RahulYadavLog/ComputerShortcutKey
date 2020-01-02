package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class IllustratorMacActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MacIllustratorAdapter recyclerViewAdapter;

    ArrayList<MacIllustratorModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illustrator_mac);






            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Mac Illustrator Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new MacIllustratorModel("Option+Click layer  :-","Select All Items on Layer",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("SpaceBar  :-","Hand Tool",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+SpaceBar (then let go of control)  :-","Hand Tool(Edition)",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+SpaceBar  :-","Zoom In Tool",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+Option+SpaceBar  :-","Zoom Out Tool",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd  :-","Access Selection or Direction Selection",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Shift+Arrow direction :-","Move Selection 10 Pts",R.drawable.illust));



        lstBook.add(new MacIllustratorModel("Shift  :-","To add a Selection",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+2  :-","Hand Tool",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+Option+2 :-","Lock Selected artwork",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Option +drag  :-","Unlock all artwork",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+Option+SpaceBar  :-","Transform",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Shift+drag bounding box :-","Scale Proportionally with selection Tools",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("I :-","Sample Intermediate Color",R.drawable.illust));

        lstBook.add(new MacIllustratorModel("Cmd+Shift+or  :-","Decrease/Increase type size",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Option +up/down :-","Decrease/Increase leading",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Option+arrow L/R  :-","Decrease /Increase Kerning or tracking",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+Shift+L/C/R  :-","Align Text left/center/right",R.drawable.illust));
        lstBook.add(new MacIllustratorModel("Cmd+Shift+Opt+S :-","Save for Web and Device",R.drawable.illust));



        recyclerView = (RecyclerView) findViewById(R.id.macillustrator);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new MacIllustratorAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
