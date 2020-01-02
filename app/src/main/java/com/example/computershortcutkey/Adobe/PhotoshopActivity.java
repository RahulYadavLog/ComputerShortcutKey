package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class PhotoshopActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    PhotoshopAdapter recyclerViewAdapter;

    ArrayList<PhotoshopModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photoshop);




            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Photoshop Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();
            lstBook.add(new PhotoshopModel("H :-","Hand Tool",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Z :-","Zoom tools",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+0 :-","Fit on Screen",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("B :-","Brush Tool",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Z :-","Undo",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Tab :-","Hide/Show Palettes",R.drawable.photoshop));




        lstBook.add(new PhotoshopModel("[ :-","Decrease Brush Size",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("] :-","Increase Brush Size",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Shift+[ :-","Decrease Brush Softness",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Shift+] :-","Increase Brush Softness",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Tab :-","Next Point on Curves Adjustment",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Shift+N :-","New layer",R.drawable.photoshop));

        lstBook.add(new PhotoshopModel("Ctrl+Alt+Shift+N :-","New Layer No Dialog",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Shift+C :-","copy Merged",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Alt+Shift+E :-","tamp visible",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Alt+Shift+K :-","Show Keyboard Command",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("F :-","Cycle Screen Mode",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("X :-","Switch Color",R.drawable.photoshop));

        lstBook.add(new PhotoshopModel("D :-","Default Color",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl++/Ctrl+- :-","Zoom In/Out",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Alt+Mouse Scroll :-","Zoom In/Out",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Alt+Z :-","Step Back",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+S :-","Save Current Opened file",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Shift+Click Mask :-","Enable/Disable Layer Mask",R.drawable.photoshop));

        lstBook.add(new PhotoshopModel("Alt+Click Mask :-","Toggle Mask Visibility",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Click Mask :-","Load Mask As Selection",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+J :-","New Layer Via Copy",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+H :-","Hide Selection Lines",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+I :-","Invert Selection",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+D :-","Deselect",R.drawable.photoshop));

        lstBook.add(new PhotoshopModel("Ctrl+G :-","Group layer",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+A :-","Select All",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+T :-","Free Transform",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+E :-","Merge Layers",R.drawable.photoshop));
        lstBook.add(new PhotoshopModel("Ctrl+Shift+E :-","Merge Visible",R.drawable.photoshop));




        recyclerView = (RecyclerView) findViewById(R.id.photoshop);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new PhotoshopAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
