package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MacPhotoshopActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MacPhotoshopAdapter recyclerViewAdapter;

    ArrayList<MacPhotoshopModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac_photoshop);




            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Mac PhotoShop Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new MacPhotoshopModel("Option-Marquee :-","New Work Book",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift :-","Draw Marquee From Center",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option :-","Subtract Form a Selection",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Option :-","Intersection with a Selection",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option+Drag Selection :-","Make Copy of Selection w/Move tool",R.drawable.mac_photoshop));



        lstBook.add(new MacPhotoshopModel("Cmd+Option+Drag Selection :-","Make Copy of Selection When not in move tool",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Arrow keys :-","Move Selection Pixel (in 1- pixel Increment)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Arrow Keys :-","Move Selection (in 10-pixel increment)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Click on Layer Thumbnail (in layer panel) :-","Select All Opaque Pixels on Layer",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Shift+D :-","Restore Last Selection",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Shift+F6 :-","Feather Selection",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Hold Space While drawing Marquee :-","Move Marquee While drawing Selection",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Shift+N :-","Create new layer ",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Click layer :-","Select non-Contiguous Layers",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Click One Layer, Then Shift-Click another layer :-","Select Contiguous Layers",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Delete key :-","Delete Layer",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option +Click layer mask icon :-","View Content of layer mask",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Click layer mask icon :-","Temporarily turn off layer icon",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option + Drag :-","Clone Layer as you move it",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Control+Click o object w/Move tool :-","Find /Select Layer containing object ",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Number keys (w/Move tool Selected) :-","Change layer opacity",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+ Plus(+)or Minus(-) :-","Cycle down or up Through blend mode",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("(w/Move tool)Shift+Option+letter(ie: N=Normal ,M=Multiple.etc) :-","Change To specific Blend mode",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option+[or Option-:-","Switch To Layer Below/above current Layer",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Delete :-","Fill Selection with foreground color",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Option+Delete :-","Fill Selection ForeGround Color",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option+Shift+Delete :-","Fill Selection With Foreground color using Lock Transparent Pixels",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Option+Delete :-","Fill Selection With source state in History panel",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Delete :-","Display Fill Dialog box",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option+Click w/Eyedropper tool :-","Sample As A background Color",R.drawable.mac_photoshop));












        lstBook.add(new MacPhotoshopModel("While in any Painting /editing tool-hold Cmd :-","To Get move tool",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option :-","To get EyeDropper With paint Tools",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Number Keys :-","Change paint opacity (With Airbrush OFF)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Number Keys :-","Change paint opacity (With Airbrush No)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Number Keys :-","Change AirBrush Flow(With AirBrush No)",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Shift+Number+Keys :-","Change Airbrush Flow (With Airbrush OFF)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Any Painting/editing tool-turn Caps Lock on :-","Cross-Hair Cursor",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("[or] :-","Decrease/Increase Brush Size ",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("[or] :-","Decrease/Increase Hardness of Brush",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Ctrl+Click in Image Window :-","open Brushes Pop-up Panel",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Option Eraser :-","Erase To History panel Source State",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Plus(+) or Minus(0) :-","Cycle Down or Up Through Blend Modes",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Opt+Latter (etc N=Normal ,M=Multiple,etc) :-","Change to Specific blend mode",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Click in Image Window :-","Create Fixed Color From Within a dialog box",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Option+Click on Target With Color Sampler tool:-","Delete Fixed Color Target ",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Cmd+Click on NewChannel Button in Channels panel :-","Create new Spot-color Channel From Current selection",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("F5 :-","Show/Hide Brushes Panel",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("F6 :-","Show/Hide Color Panel",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("F7 :-","Show/Hide Layers Panel",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("F8 :-","Show/Hide Info Panel",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("Option+F9 :-","Show/Hide Action Panel",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Option+O :-","open Adobe Bridge",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Tild(~) :-","Switch Between Open Document",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Shift+Option +Z/Shift+Z :-","Undo Redo Operation beyond last one",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+F :-","Apply Last Filter",R.drawable.mac_photoshop));



        lstBook.add(new MacPhotoshopModel("Cmd+Option+F :-","Open Last Filter Dialog Box",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("SpaceBar :-","Hand Tool",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Hold Option ,Cancel Turns into Reset Button,Click it :-","Increase/DeCrease Value(In Any Option Fields)by 1 units",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Up/Down Arrow :-","Increase/DeCrease Value(In Any Option Fields)by 10 units",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Cmd+Shift+T :-","Repeat Last TransFormation",R.drawable.mac_photoshop));

        lstBook.add(new MacPhotoshopModel("After ruler is drown,option-drag end of line with Ruler Tool :-","Measure Angle Between Lines (Protractor Function)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("HoldS pace While Drawing :-","Move Crop Marquee While Creating",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("HoldS Shift While Drawing :-","Snap Guide To Ruler Ticks",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Return :-","Highlight Fields in Operation bar (n/a for all Tools)",R.drawable.mac_photoshop));
        lstBook.add(new MacPhotoshopModel("Hold Control While Dragging :-","Don't Snap Object Edge While moving",R.drawable.mac_photoshop));


        recyclerView = (RecyclerView) findViewById(R.id.macphotoshop);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new MacPhotoshopAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
